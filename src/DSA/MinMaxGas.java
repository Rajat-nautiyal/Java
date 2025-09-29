package DSA;

import java.util.PriorityQueue;

public class MinMaxGas {
    public static class Pair {
        double first;
        int second;

        Pair(double first, int second) {
            this.first = first;
            this.second = second;
        }
    }

    public static double minimiseMaxDistance(int[] arr, int k) {
        int[] howMany = new int[arr.length - 1];
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> Double.compare(b.first, a.first));
        // for(int gas = 1; gas <= k; gas++){
        // double max = -1;
        // int maxI = -1;
        // for(int i = 0; i<arr.length-1; i++){
        // double diff = arr[i+1] - arr[i];
        // double sectionLength = (double)diff/(double)(howMany[i]+1);
        // if(max < sectionLength){
        // max = sectionLength;
        // maxI = i;
        // }
        // }
        // howMany[maxI] += 1;
        // }
        for(int i = 0; i < arr.length-1; i++){
            double diff = arr[i+1] - arr[i];
            pq.add(new Pair(diff, i));
        }
        for(int gas = 1; gas <= k; gas++){
            Pair tp = pq.poll();
            int ind = tp.second;
            howMany[ind]++;
            double indiff = (double)arr[ind+1] - arr[ind];
            double inSecLength = (double)indiff/(howMany[ind]+1);
            pq.add(new Pair(inSecLength, ind));
        }
        // double max = 0;
        // for (int i = 0; i < arr.length - 1; i++) {
        //     double diff = arr[i + 1] - arr[i];
        //     double sectionLength = (double) diff / (double) (howMany[i] + 1);
        //     max = (double) Math.max(max, sectionLength);
        // }
        return pq.peek().first;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 13, 17, 23 };
        int k = 5;
        double ans = minimiseMaxDistance(arr, k);
        System.out.println("The answer is: " + ans);
    }

}
