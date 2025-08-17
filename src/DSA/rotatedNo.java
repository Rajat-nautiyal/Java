package DSA;

public class rotatedNo {
    public static void rotatedNo(int[] nums) {
        int left = 0, right = nums.length - 1;
        int ans = Integer.MAX_VALUE;
        int index = 0;
        while(left <= right){
            int mid = (left + right)/2;
            if(nums[mid]>=nums[left]){//left part is sorted
                if(ans >= nums[left]){
                    index = left;
                }
                ans = Math.min(ans, nums[left]);                
                left = mid + 1;
            }else{ // right part is sorted
                if(ans >= nums[mid]){
                    index = right;
                }
                ans = Math.min(ans, nums[mid]);
                right = mid - 1;
            }
        }
        System.out.println(index);
    }

    public static void main(String args[]) {
        int[] nums = { 3,4,5,1,2 };
        rotatedNo(nums);

    }

}
