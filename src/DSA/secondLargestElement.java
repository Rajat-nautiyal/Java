package DSA;

public class secondLargestElement {

    // public static void largestSecondElement(int[] arr, int n) {
    // int max = Integer.MIN_VALUE;
    // int min = Integer.MAX_VALUE;
    // int secondLargest = Integer.MIN_VALUE;
    // int secondSmallest = Integer.MAX_VALUE;
    // if(n<2){
    // System.out.println("not enough elements");
    // return;
    // }
    // for (int i = 0; i < n; i++) {
    // max = Math.max(max, arr[i]);
    // min = Math.min(min, arr[i]);
    // }
    // for (int j = 0; j < n; j++) {
    // if(secondLargest < arr[j] && arr[j] != max){
    // secondLargest = arr[j];
    // }
    // if(secondSmallest > arr[j] && arr[j] != min){
    // secondSmallest = arr[j];
    // }
    // }

    // System.out.println(secondLargest);
    // System.out.println(secondSmallest);
    // }

    public static void largestSecondElement(int[] arr, int n) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        if (n < 2) {
            System.out.println("too small array");
        }
        for (int i = 0; i < n; i++) {
            // System.out.println(arr[i]);
            if (arr[i] > max) {
                secondLargest = max;
                max = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != max) {
                secondLargest = arr[i];
            }

            if (arr[i] < min) {
                secondSmallest = min;
                min = arr[i];
            } else if (arr[i] < secondSmallest && arr[i] != min) {
                secondSmallest = arr[i];
            }

        }
        System.out.println(secondLargest);
        System.out.println(secondSmallest);
    }

    public static void main(String args[]) {
        int[] arr = { 1, 6, 2, 3, 5, 6 };
        largestSecondElement(arr, arr.length);
        // System.out.println(element);

    }

}