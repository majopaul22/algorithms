import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Scratch {
    public static void main(String[] args) {
        List l1 = new ArrayList<String> (
            Arrays.asList("A", "B", "C"));
        List <String> l3 = new ArrayList<> (
            Arrays.asList("A", "B", "C"));
        long l2[] = new long[10];
        Arrays.fill(l2, 1);
        l1.forEach(System.out::print);
        System.out.println(l1);
        System.out.println(Arrays.toString(l2));
        System.out.println(l2.toString());
        System.out.println(l3.toString());
    }
}