package DSA;
import java.util.*;

public class PainterPar {
    public static int CanWePartitionPaint(int minTime, List<Integer> boards){
        int painterCnt = 1;
        int lastValue = boards.get(0);
        for(int i = 1; i < boards.size(); i++){
            if(lastValue + boards.get(i) <= minTime){
                lastValue += boards.get(i);
            }else{
                painterCnt++;
                lastValue = boards.get(i);
            }
        }
        return painterCnt;
    }
    public static int findLargestMinDistance(List<Integer> boards, int k){
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0; i < boards.size(); i++){
            max = Math.max(max, boards.get(i));
            sum += boards.get(i);
        }
        // for(int i = max; i <= sum; i++){
        //     if(CanWePartitionPaint(i,boards) <= k) return i;
        // }
        int left = max;
        int right = sum;
        while(left<=right){
            int mid = left + (right - left)/2;
            if(CanWePartitionPaint(mid,boards)<=k){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return left;
    }
    public static void main(String[] args) {
        ArrayList<Integer> boards = new ArrayList<>(Arrays.asList(10, 20, 30, 40));
        int k = 2;
        int ans = findLargestMinDistance(boards, k);
        System.out.println("The answer is: " + ans);
    }
    
}
