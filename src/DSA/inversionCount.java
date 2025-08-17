package DSA;

import java.util.*;

public class inversionCount {
    public static int merge(int left, int mid, int right, int[] nums){
        int low = left;
        int high = mid + 1;
        int cnt = 0;
        List<Integer> temp = new ArrayList<>();
        while(low<=mid && high <= right){
            if(nums[low] <= nums[high]){
                temp.add(nums[low]);
                low++;
            }else{
                cnt += (mid - low + 1);
                temp.add(nums[high]);
                high++;
            }
        }
        while(low<=mid){
            temp.add(nums[low]);
            low++;
        }
        while(high<=right){
            temp.add(nums[high]);
            high++;
        }
        for(int i = left; i <= right; i++){
            nums[i] = temp.get(i-left);
        }
        return cnt;
    }
    public static int mergeSort(int left, int right, int[] nums){
        int cnt = 0;
        if(left>=right) return cnt;
        int mid = (left + right)/2;
        cnt += mergeSort(left, mid, nums);
        cnt += mergeSort(mid+1, right, nums);
        cnt += merge(left, mid, right, nums);
        return cnt;
    }
    public static void main(String args[]){
        int[] nums = {5,3,2,1,4};
        int count = mergeSort(0, nums.length-1, nums);
        System.out.println((count));

    }
}
