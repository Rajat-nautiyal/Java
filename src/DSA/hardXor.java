package DSA;

import java.util.*;

public class hardXor {
    // public static void getSubArray(int[] nums, List<List<Integer>> ans, int k){
    //     for(int i = 0; i < nums.length; i++){
    //         int result = 0;
    //         for(int j = i; j< nums.length; j++){
    //             result = result^nums[j];
    //             if(result == k){
    //                 ans.add(new ArrayList<>(Arrays.asList(i,j)));
    //             }
    //         }
    //     }
    //     System.out.println(ans.size());
    // }

    public static void getSubArray(int[] nums, int k){
        Map<Integer,Integer> map = new HashMap<>();
        int cnt = 0;
        int xr = 0;
        map.put(xr,1);
        for(int i = 0; i < nums.length; i++){
            xr = xr^nums[i];
            int x = xr^k;
            if(map.containsKey(x)){
                cnt = cnt + map.get(x);
            }
            if(map.containsKey(xr)){
                map.put(xr,map.get(xr)+1);
            }else{
                map.put(xr, 1);
            }

        }
        System.out.println(cnt);
    }
    public static void main(String args[]){
        int[] nums = {4, 2, 2, 6, 4};
        // int[] nums = {5, 6, 7, 8, 9};
        int k = 6;
        List<List<Integer>> ans = new ArrayList<>();
        // getSubArray(nums, ans, k);
        getSubArray(nums, k);
    }
}
