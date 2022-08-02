import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Scratch {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(10);
        CompletableFuture future = service.submit()
    }

}