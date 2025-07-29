package DSA.sorting;

public class quicksort {
    public static void quickSort(int[] arr, int low, int high){
        if(low < high){
            int pIndex = partition(arr,low, high);
            quickSort(arr, low, pIndex-1);
            quickSort(arr, pIndex+1, high);
        }
    }
    public static int partition(int[] arr, int low, int high){
        int i = low;
        int j = high;
        int pivot = low;
        while(i<j){
            while(i<=high && arr[pivot]>=arr[i]){
                i++;
            }
            while(j>=low && arr[pivot]<arr[j]){
                j--;
            }
            if(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp1 = arr[low];
        arr[low] = arr[j];
        arr[j] = temp1;
        return j;
    }
    public static void main(String args[]){
        int[] arr = {4,6,2,5,7,1,3,-1};
        int n = arr.length;
        quickSort(arr, 0, n-1);
        for(int i =0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }

}
