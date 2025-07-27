package DSA.sorting;

public class Q9 {
    public static int countSubarrays(int[] arr, int k){
        int result = 0;
        int sum = 0;
        for(int i = 0; i<arr.length; i++){
            sum = 0;
            for(int j = i; j < arr.length; j++){
                sum = sum + arr[j];
                if(sum == k){
                    result++;
                }
            }
        }
        return result;
    }
    public static void main(String[] args){
        int[] arr = {1,-2,3};
        int k = -1;
        int count = countSubarrays(arr,k);
        System.out.println(count);
    }
}   
