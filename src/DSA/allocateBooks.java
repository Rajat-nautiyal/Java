package DSA;
import java.util.*;

public class allocateBooks {

    public static int countPages(int pages, int[] arr, int m){
        int studentCnt = 1;
        int prevPages = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(prevPages + arr[i] <= pages){
                prevPages += arr[i];
            }else{
                studentCnt++;
                prevPages = arr[i];
            }
        }
        return studentCnt;
    }
    public static int findPages(int[] arr, int m){
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0; i<arr.length; i++){
            max = Math.max(max,arr[i]);
            sum += arr[i];
        }
        // for(int i = max; i<=sum; i++){
        //     if(countPages(i, arr, m) == m) return i;
        // }
        int ans = -1;
        int left = max;
        int right = sum;        
        while(left <= right){
            int mid = left + (right - left)/2;
            if(countPages(mid, arr, m) == m){
                ans = mid;
                right = mid - 1;
            }else if(countPages(mid, arr, m) < m){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {25, 46, 28, 49, 24};
        int m = 4;
        int ans = findPages(arr, m);
        System.out.println("The answer is: " + ans);
    }

}
