import com.sun.deploy.util.StringUtils;

import java.util.Arrays;

class Scratch {
    static void reverse(int a[], int li, int ri) {
        while(li < ri) {
            int t = a[li];
            a[li] = a[ri];
            a[ri] = t;
            li++;
            ri--;
        }
    }
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7};
        int k = 2;
        reverse(a, 0, a.length-k-1);
        reverse(a, a.length-k, a.length-1);
        reverse(a, 0, a.length-1);
        for( int i : a)
            System.out.print(i + " ");
        String s1 = "short";
        StringBuilder sb1 = new StringBuilder(s1);
        System.out.println(s1 + " " + sb1.reverse());
        String[] sa1 = {"one", "two"};
        System.out.println(Arrays.toString(sa1));
//        Arrays.stream(a).forEach(e -> System.out.print(e + " "));
    }
}