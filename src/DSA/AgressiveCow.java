package DSA;

import java.util.*;

public class AgressiveCow {
    public static boolean canWeputCow(int minGap, int cows, int[] stalls){
        int last = stalls[0];
        int cowCnt = 1;
        for(int i = 1; i < stalls.length; i++){
            if(stalls[i] - last >= minGap){
                cowCnt++;
                last= stalls[i];
            }            
            if(cowCnt>=cows) return true;
        }
        return false;
    }
    public static int aggressiveCows(int[] stalls, int k){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        Arrays.sort(stalls);
        for(int i = 0; i < stalls.length; i++){
            max = Math.max(max, stalls[i]);
            min = Math.min(min, stalls[i]);
        }
        // for(int i = 1; i<=max; i++){
        //     if(canWeputCow(i,k,stalls)==true) continue;
        //     else return i-1;
        // }
        int left = 1;
        int right = max - min;
        int ans = -1;
        while(left <= right){
            int mid = (left+right)/2;
            if(canWeputCow(mid, k, stalls)== true){
                ans = mid;
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] stalls = { 0, 3, 4, 7, 10, 9 };
        int k = 4;
        int ans = aggressiveCows(stalls, k);
        System.out.println("The maximum possible minimum distance is: " + ans);
    }

}
