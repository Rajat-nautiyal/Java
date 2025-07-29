package DSA;

public class largestElementArray {

    public static int largestElement(int[] arr, int n){
        int max = 0;
        for(int i = 0; i < n; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String args[]){
        int[] arr = {2,5,1,3,0};
        int element = largestElement(arr, arr.length-1);
        System.out.println(element);
    }
}
