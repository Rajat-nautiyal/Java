package DSA;

import java.util.*;

public class Union {
    static ArrayList<Integer> FindUnion(int[] arr1, int[] arr2, int n, int m) {
        // HashSet<Integer> set = new HashSet<>();
        // ArrayList<Integer> Union = new ArrayList<>();

        // for (int val1 : arr1) {
        // set.add(val1);
        // }
        // for (int val2 : arr2) {
        // set.add(val2);
        // }
        // for (int val : set) {
        // Union.add(val);
        // }
        // Collections.sort(Union);
        // return Union;

        ArrayList<Integer> Union = new ArrayList<>();
        int i = 0, j = 0;
        while (i < n && j < m) {
            if (arr1[i] == arr2[j]) {
                Union.add(arr1[i]);
                i++;
                j++;
            }
            if (arr1[i] < arr2[j]) {
                Union.add(arr1[i]);
                i++;
            }
            if (arr1[i] > arr2[j]) {
                Union.add(arr2[j]);
                j++;
            }
        }
        while (i < n) {
            Union.add(arr1[i]);
            i++;
        }
        while (j < m) {
            Union.add(arr2[j]);
            j++;
        }
        return Union;

    }

    public static void main(String[] args) {
        int n = 7, m = 10;
        int arr1[] = { 2, 3, 4, 4, 5, 11, 12 };
        int arr2[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        ArrayList<Integer> Union = FindUnion(arr1, arr2, n, m);
        for (int z : Union) {
            System.out.print(z + " ");
        }
    }
}
