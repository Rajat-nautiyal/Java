package DSA;

import java.util.HashMap;

public class longSubArray {
    public static int LongsubArrayCount(int[] arr, int n, int k) {
        //brute force
        // int count = -1;
        // for (int i = 0; i < n; i++) {
        //     int sum = arr[i];
        //     for (int j = i + 1; j < n; j++) {
        //         sum = sum + arr[j];
        //         if (sum == k) {
        //             if (count < j - i + 1) {
        //                 count = j - i + 1;
        //             }
        //         }
        //     }
        // }
        // return count;

        //better approach(using hashmap)
        // HashMap<Integer,Integer> map = new HashMap<>();
        // int maxLength = 0;
        // int sum = 0;
        // for(int i = 0; i < n; i++){
        //     sum = sum + arr[i];
        //     if(sum == k){
        //         maxLength = Math.max(maxLength, i+1);
        //     }
        //     int rem = sum - k;
        //     if(map.containsKey(rem)){
        //         int p = i - map.get(rem);
        //         maxLength = Math.max(maxLength, p);
        //     }
        //     if(!map.containsKey(sum)){
        //         map.put(sum, i);
        //     }
        // }

        //little optimal approach(using two pointer)
        int left = 0;
        int  right = 0;
        int sum = arr[0];
        int maxLength = 0;
        for(int i = 0; i < arr.length; i++){
            while(left<right && sum > k){
                sum = sum - arr[left];
                left++;
            }
            if(sum == k){
                maxLength = Math.max(maxLength, right - left + 1);
            }
            right++;
            if(right<n) sum += arr[right];
        }

        return maxLength;
    }

    public static void main(String args[]) {
        int[] arr = { -1, 1, 1 };
        int k = 1;
        int element = LongsubArrayCount(arr, arr.length, k);
        System.out.println(element);
    }

}
