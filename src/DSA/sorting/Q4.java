package DSA.sorting;
import java.util.*;

class Q4{
    public static int lenOfLongSubarr (int A[], int N, int K) {
        //optimized approach 
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0, maxLength = 0;

        for (int i = 0; i < N; i++) {
            sum += A[i];

            // Check if entire subarray from 0 to i has sum K
            if (sum == K) {
                maxLength = i + 1;
            }

            // Check if (sum - K) exists in map
            if (map.containsKey(sum - K)) {
                maxLength = Math.max(maxLength, i - map.get(sum - K));
            }

            // Store first occurrence of sum
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }
        return maxLength;

        //brute force approach O(N^2)
        // int maxLength = 0;
        // int sum = 0;
        // for(int i = 0; i<N; i++){
        //     sum = 0;
        //     for(int j = i; j<N; j++){
        //         sum = sum + A[j];
        //         if(sum == K){
        //             if(maxLength < (j - i + 1)){
        //                 maxLength = j - i + 1; 
        //             }
        //         }
        //     }
            
        // }
        // return maxLength;

    }
    public static void main(String args[]){
        int[] arr = {10,-10,15,30};
        int N = arr.length;
        int k = 5;
        int length = lenOfLongSubarr(arr, N, k);
        System.out.println(length);
    }
}

