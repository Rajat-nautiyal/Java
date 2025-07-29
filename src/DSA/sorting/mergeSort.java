package DSA.sorting;

import java.util.ArrayList;

public class mergeSort {

    public static void merge(int[] arr, int low, int mid, int high){
        int left = low;
        int right = mid + 1;
        ArrayList<Integer> list = new ArrayList<>();        
        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                list.add(arr[left]);
                left++;
            }else{
                list.add(arr[right]);
                right++;
            }
        }
        while(left<=mid){
            list.add(arr[left]);
            left++;
        }
        while(right<=high){
            list.add(arr[right]);
            right++;
        }
        for(int i = low; i<=high; i++){
            arr[i] = list.get(i - low);
        }
    }
    public static void merge_sort(int[] arr, int low, int high){
        if(low>=high) return;
        int mid = (low + high)/2;
        merge_sort(arr, low, mid);
        merge_sort(arr, mid + 1, high);
        merge(arr,low,mid,high);

    }
    public static void main(String[] args){
        int[] arr = {3,4,1,2,6,5};
        merge_sort(arr, 0,arr.length-1);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
        }
    }
}
