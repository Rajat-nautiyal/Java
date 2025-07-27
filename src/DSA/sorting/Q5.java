package DSA.sorting;

public class Q5 {
    //find the contiguous subarray (containing at least one number) which has the largest sum and returns its sum and prints the subarray
    //brute force approach
    public static int longSumArr(int arr[]){
        int sum = 0;
        int max = 0;
        // for(int i = 0; i< arr.length; i++){
        //     sum = 0;
        //     for(int j = i; j<arr.length; j++){
        //         sum += arr[j];
        //         if(sum>max){
        //             max = sum;
        //         }
        //     }
        // }

        //optimized approach O(n) Kadane's algo
        for(int i = 0; i< arr.length; i++){
            sum += arr[i];
            max = Math.max(sum, max);
            if(sum<0){
                sum = 0;
            }
        }
        return max;
    }
    public static void main(String args[]){
        int[] arr = {-1,-2};
        int result = longSumArr(arr);
        System.out.println(result);
    }
}
