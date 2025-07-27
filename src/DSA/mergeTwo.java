package DSA;
import java.util.*;

public class mergeTwo {
    public static void mergeTwoSortedArraysWithoutExtraSpace(long []a, long []b) {
        int j = 0;
        int k = 0;
        for(int i = 0; i < a.length + b.length; i++) {
            if(j == a.length && k != b.length) {
                System.out.print(b[k] + " ");
                k++;   
                continue;
            }
            if(k == b.length && j != a.length) {
                System.out.print(a[j] + " ");
                j++;
                continue;   
            }
            if(j != a.length && k != b.length) {
                if(a[j] < b[k]) {
                    System.out.print(a[j] + " ");
                    j++;
                } else {
                    System.out.print(b[k] + " ");
                    k++;
                }
            }
        }
    }

    public static void main(String[] args) {
        long[] a = {1, 2, 3, 4, 5};
        long[] b = {8, 8};
        mergeTwoSortedArraysWithoutExtraSpace(a, b);
    }
}
