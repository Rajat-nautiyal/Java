package DSA;

public class missingRepeating {
    // public static int[] findMissingRepeatingNumbers(int[] nums){
    // int repeating = -1;
    // int missing = -1;
    // int[] hash = new int[nums.length + 1];
    // for(int i= 0; i < nums.length; i++){
    // hash[nums[i]]++;
    // }
    // for(int i = 1; i <= hash.length; i++){
    // if(hash[i] == 2) repeating = i;
    // else if(hash[i] == 0) missing = i;

    // if(repeating != -1 && missing != -1) return new int[]{repeating,missing};
    // }
    // return new int[]{repeating, missing};
    // }

    // public static int[] findMissingRepeatingNumbers(int[] nums) {
    // int x = 0, y = 0;
    // int n = nums.length;
    // int s = 0;
    // int s2 = 0;
    // int sn = n*(n+1)/2;
    // int sn2 = n*(n+1)*(2*n+1)/6;
    // for(int i = 0; i < nums.length; i++){
    // s += nums[i];
    // s2 += nums[i] * nums[i];
    // }
    // int val1 = s - sn; //x-y
    // int val2 = ((s2 - sn2)/val1);//x+y
    // x = (val2 + val1)/2;
    // y = x - val1;
    // return new int[]{x, y};
    // }

    public static int[] findMissingRepeatingNumbers(int[] nums) {
        int repeating = -1;
        int missing = -1;
        int xor = 0;
        for (int i = 0; i < nums.length; i++) {
            xor = xor ^ nums[i];
            xor = xor ^ (i + 1);
        }
        int number = xor & ~(xor - 1);
        int grp0 = 0;
        int grp1 = 0;
        for (int i = 0; i < nums.length; i++) {
            if ((nums[i] & number) != 0) {
                grp1 = grp1 ^ nums[i];
            } else {
                grp0 = grp0 ^ nums[i];
            }
            if ((i+1 & number) != 0) {
                grp1 = grp1 ^ (i+1);
            } else {
                grp0 = grp0 ^ (i+1);
            }
        }
        repeating = grp1;
        missing = grp0;
        return new int[] { repeating, missing };
    }

    public static void main(String[] args) {
        int[] a = { 3,1,2,5,3 };
        int[] ans = findMissingRepeatingNumbers(a);
        System.out.println("The repeating and missing numbers are: {"
                + ans[0] + ", " + ans[1] + "}");
    }

}
