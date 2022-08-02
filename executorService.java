import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.concurrent.*;

class Scratch {
    private static class RunCommand implements Callable<String> {
        int i;
        RunCommand(int j) {
            i = j;
        }
        @Override
        public String call() throws Exception {
            System.out.println(" called thread: " + i);
            return " from thread "  + i;
        }
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        System.out.println(new Date());

        List<Callable<String>> callList = new ArrayList<>();
        for (int i=0; i<5; i++)
            callList.add(new RunCommand(i));
        String callString = executorService.invokeAny(callList);
        List<Future<String>> futureList = new ArrayList<>();
        for (int i=0; i<10; i++)
            futureList.add((Future<String>) executorService.submit(new RunCommand(i)));
//        executorService.execute(new command(i));
        executorService.awaitTermination(10, TimeUnit.SECONDS);
//        System.out.println(Arrays.toString(futureList.get));
        for (Future<String> future : futureList)
            System.out.println(future.get());
        System.out.println(" call list: " + callString);
//        futureList.toArray().forEach(System.out::println);
        System.out.println(new Date());
    }
}