package DSA.sorting;

public class Q2 {
    //Q. remove the duplicates from the array and get the no. of unique elements
    public static int removeDuplicates(int[] nums) {
        int[] temp = new int[nums.length];
        int k = 0;
        
        for (int i = 0; i < nums.length - 1; i++) {  
            if (nums[i] == nums[i + 1]) {
                continue;
            } else {
                temp[k] = nums[i];
                k++;
            }
        }
        
        // Add the last element (since it won't be handled in the loop)
        temp[k] = nums[nums.length - 1];
        k++;

        // Print the temp array up to 'k' to avoid printing extra zeroes
        for (int j = 0; j < k; j++) {
            System.out.print(temp[j] + " ");
        }
        System.out.println();

        return k;
    }

    public static void main(String args[]) {
        int[] arr = {1, 1, 2, 2, 3, 4, 5, 6};
        int check = removeDuplicates(arr);
        System.out.println("Unique elements count: " + check);
    }
}
