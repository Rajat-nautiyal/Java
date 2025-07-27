package DSA.sorting;

public class quicksort {
    static void quickSort(int arr[], int low, int high) {
        if(low<high){            
            int pindex = partition(arr, low, high);
            quickSort(arr, low, pindex - 1);
            quickSort(arr, pindex +1, high);
        }
        
    }

    static int partition(int arr[], int low, int high) {
        int i = low;
        int j = high;
        int pivot = arr[low];
        
        while(i<j){
            while(arr[i]<= pivot && i<high){
                i++;
            }
            while(arr[j]> pivot && j>low){
                j--;
            }
            if(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int tempone = arr[low];
        arr[low] = arr[j];
        arr[j] = tempone;
        return j;
    }
    public static void main(String args[]){
        int[] arr = {4,6,8,5,1,2};
        int n = arr.length;
        quickSort(arr, 0, n-1);
        for(int i =0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }

}
