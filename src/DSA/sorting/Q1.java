package DSA.sorting;
//check whether the array is sorted or not(return true or false)
public class Q1 {
    public static boolean checkSorting(int arr[]){
        boolean bool = false;
        for(int i = 1; i<arr.length; i++){
            if(arr[i]>= arr[i-1]){
                bool = true;
            }
            else{
                bool = false;
                break;            
            } 
        }
        return bool;
    }
    public static void main(String args[]){
        int[] arr = {1,2,3,4,5,6};
        boolean check = checkSorting(arr);
        System.out.println(check);
    }
}
