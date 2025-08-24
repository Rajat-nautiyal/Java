package DSA;

import java.util.*;

public class TwoDBinary {

    public static int rowWithMax1s(ArrayList<ArrayList<Integer>> mat, int n, int m) {
        int ans = -1;
        int index = -1;
        int max = -1;

        for (int i = 0; i < n; i++) {
            int left = 0;
            int right = m - 1;
            int cnt = 0;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (mat.get(i).get(mid) == 1) {
                    cnt = m - mid;
                    right = mid - 1;
                    if (cnt > max) {
                        index = i;
                        max = Math.max(max, cnt);
                    }
                } else
                    left = mid + 1;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(0, 1, 1, 1)));
        matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1, 1)));
        matrix.add(new ArrayList<>(Arrays.asList(0, 0, 1, 1)));

        int n = 3, m = 4;
        System.out.println("The row with max 1's is: " +
                rowWithMax1s(matrix, n, m));
    }

}
