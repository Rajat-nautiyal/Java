package DSA;

import java.util.*;

public abstract class permute {
    // public static void recurPermute(int[] nums, List<List<Integer>> list,
    // boolean[] freq, List<Integer> map) {
    // if (map.size() == nums.length) {
    // list.add(new ArrayList<>(map));
    // return;
    // }
    // for (int i = 0; i < nums.length; i++) {
    // if (!freq[i]) {
    // freq[i] = true;
    // map.add(nums[i]);
    // recurPermute(nums, list, freq, map);
    // map.remove(map.size() - 1);
    // freq[i] = false;
    // }
    // }
    // }

    // public static void main(String args[]) {
    // int[] nums = { 1, 2, 3 };
    // boolean[] freq = new boolean[nums.length];
    // List<List<Integer>> list = new ArrayList<>();
    // List<Integer> map = new ArrayList<>();
    // recurPermute(nums, list, freq, map);
    // for (List<Integer> permutation : list) {
    // System.out.println(permutation);
    // }
    // }

    public static void recurPermute(int index, int[] nums, List<List<Integer>> list) {
        if (index == nums.length) {
            List<Integer> ds = new ArrayList<>();
            for (int m : nums) {
                ds.add(m);
            }
            list.add(new ArrayList<>(ds));
            return;
        }
        for (int i = index; i < nums.length; i++) {
            swap(i, index, nums);
            recurPermute(index + 1, nums, list);
            swap(i, index, nums); // to make it in original pos.
        }
    }

    public static void swap(int i, int index, int[] nums) {
        int temp = nums[i];
        nums[i] = nums[index];
        nums[index] = temp;
    }

    public static void main(String args[]) {
        int[] nums = { 1, 2, 3 };
        List<List<Integer>> list = new ArrayList<>();
        recurPermute(0, nums, list);
        for (List<Integer> permutation : list) {
            System.out.println(permutation);
        }
    }

}
