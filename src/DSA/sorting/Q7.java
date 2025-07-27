package DSA.sorting;
import java.util.*;

public class Q7 {
    public static void recurrPermut(int[] nums, boolean[] freq, ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> ds ){
        if(ds.size() == nums.length){
             ans.add(new ArrayList<>(ds));
             return;
        }
        for(int i = 0; i < nums.length; i++){
            if(!freq[i]){
                freq[i] = true;
                ds.add(nums[i]);
                recurrPermut(nums, freq, ans, ds);
                freq[i] = false;
                ds.remove(ds.size() - 1);
            }
        }
    }

    public static void main(String[] args){
        int[] nums = {1,2,3};
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> ds = new ArrayList<>();
        boolean[] freq = new boolean[nums.length];
        recurrPermut(nums, freq, ans, ds);
        System.out.println("Permutations are" + ans);
    }
}
