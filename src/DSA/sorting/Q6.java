package DSA.sorting;

public class Q6 {
    //STOCK BUY AND SELL PROBLEM
    public static void buyStockNsell(int arr[]){
        int min = 0;
        int max = 0;
        int minIndex = 0;
        int maxIndex = 0;
        int result = 0;
        for(int i = 0; i<arr.length; i++){
            if(min>arr[i]){
                min = arr[i];
                minIndex = i;
            }
        }
        for(int i = 0; i<arr.length; i++){
            if(max<arr[i]){
                max = arr[i];
                maxIndex = i;
            }
        }

        if(min<max && minIndex<maxIndex){
            result = max-min;
            System.out.println(result);
        }
        System.out.println(result);
    }
    public static void main(String args[]){
        int[] arr = {7,1,5,3,6,4};
        buyStockNsell(arr);
    }
}
