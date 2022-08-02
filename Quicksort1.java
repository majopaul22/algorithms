import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Quicksort1 {
    static void quicksort(int a[], int begin, int end) {
        if(begin < end) {
            int pivot = partition(a, begin, end);
            quicksort(a, begin, pivot - 1);
            quicksort(a, pivot + 1, end);
        }
    }
    static int partition(int a[], int begin, int end) {
        int pivot = a[end];
        int i = begin - 1;
        for (int j = begin; j < end; j++) {
            if (a[j] <= pivot) {
                i++;
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        int temp = a[i+1];
        a[i+1] = a[end];
        a[end] = temp;
        return i+1;
    }
    public static void main(String[] args) {
        int[] a = {81, 17, 6, 9 , 100, 91};
        //sort
//        Arrays.stream(a).sorted().forEach(System.out::println);
        Arrays.stream(a).sorted().forEach(e -> System.out.print(e + " "));
//        Arrays.stream(a).sorted().
//        quicksort(a, 0, 5);
//        for(int i=0; i < a.length; i++)
//            System.out.print(a[i]+ " ");
    }
}