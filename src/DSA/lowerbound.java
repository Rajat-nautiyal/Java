package DSA;
public class lowerbound {
    public static int lowBound(int[] arr, int x){
        int left = 0;
        int right = arr.length - 1;
        int ans = -1;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(arr[mid] < x){
                left = mid + 1;
            }else if(arr[mid] >= x){
                ans = mid;
                right = mid - 1;
            }
        }
        return ans;
    }
    public static void main(String args[]){
        int[] arr = {3, 5, 8, 15, 19};
        int x = 4;
        int ind = lowBound(arr, x);
        System.out.println("The lower bound is the index: " + ind);

    }
}
