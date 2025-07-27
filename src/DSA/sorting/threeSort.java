package DSA.sorting;

public class threeSort {
    //selection sort step- find the min. element in array and swap it
    public static void selection_sort(int[] arr , int n){
        int min;
        for(int i =0; i<n-1; i++){
            min = i;
            for(int j=i+1; j<n;j++){
                if(arr[j]<arr[min]){
                    min = j; //finding the minimum index in array loop
                }
            }
            int temp = arr[i];     //swapping        
            arr[i] = arr[min];
            arr[min] = temp;
        }
        System.out.print("selection sort");
        for(int k =0; k<arr.length; k++){
            System.out.print(arr[k]+ " ");
        }
    }
    
    public static void bubble_sort(int[] arr, int n){
        for(int i = n -1; i>=0; i--){
            for(int j =0; j < i; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];     //swapping        
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;        
                }
            }
        }
        System.out.println("bubble sort");
        for(int k =0; k<arr.length; k++){
            System.out.print(arr[k]+ " ");
        }
    }

    public static void insertion_sort(int[] arr, int n){
        for(int i = 0; i<n; i++){
            int j = i;
            while(j>0 && arr[j-1]>arr[j]){
                int temp = arr[j-1];     //swapping        
                arr[j-1] = arr[j];
                arr[j] = temp; 
                j--;         
            }
        }
        for(int k = 0; k<n; k++){
            System.out.print(arr[k]+ " ");
        }
    }

    public static void main(String args[]){
        int[] arr = {13,46,24,52,20,9};
        int n = arr.length;
        // selection_sort(arr, n);
        insertion_sort(arr,n);
    }
}
