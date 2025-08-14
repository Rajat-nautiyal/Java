package DSA;

import java.util.*;

public class leaders {
    // public static void leadersInArray(int[] nums, List<Integer> ans) {
    //     int i = 0, j = i+1;
    //     while(i<j && j<=nums.length-1){
    //         if(nums[i] > nums[j]){
    //             if(j == nums.length - 1){
    //                 ans.add(nums[i]);
    //                 i++;
    //                 j = i+1;
    //                 continue;
    //             }
    //             j++;
    //         }else if(nums[i] <= nums[j]){
    //             i++;
    //             j = i+1;
    //         }
    //     }
    //     ans.add(nums[nums.length-1]); //adding the last element
    // }//n^2 time complexity

    public static void leadersInArray(int[] nums, List<Integer> ans){
        //last elements are always leaders
        ans.add(nums[nums.length-1]);
        int max = nums[nums.length-1];

        //running loop from 2nd last
        for(int i = nums.length - 2; i >= 0; i--){
            if(nums[i] > max){
                ans.add(nums[i]);
                max = nums[i];
            }
        }
    }
    public static void main(String args[]){
        int nums[]=  {10, 22,22, 12, 3, 0, 6};
        // int nums[]=  {4, 7, 1, 0};
        List<Integer> ans = new ArrayList<>();
        leadersInArray(nums,ans);
        for(int lead:ans){
            System.out.println(lead+" ");
        }

    }
}
