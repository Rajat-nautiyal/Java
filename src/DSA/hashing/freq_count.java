package DSA.hashing;

public class freq_count {
    public static void main(String[] args) {
        int[] arr = {3,2,2,4,4,2};
        int[] hashArr = new int[7];

        for (int i = 0; i < arr.length; i++) {
            hashArr[arr[i]]++;
        }

        int maxFreqElement = arr[0];
        int maxFreq = hashArr[arr[0]];

        int minFreqElement = arr[0];
        int minFreq = hashArr[arr[0]];

        for (int j = 0; j < arr.length; j++) {
            if (hashArr[arr[j]] > maxFreq) {
                maxFreq = hashArr[arr[j]];
                maxFreqElement = arr[j];
            }
            if (hashArr[arr[j]] < minFreq) {
                minFreq = hashArr[arr[j]];
                minFreqElement = arr[j];
            }
            // System.out.println("iter3");
        }

        System.out.println("Element with highest frequency: " + maxFreqElement + " (Frequency: " + maxFreq + ")");
        System.out.println("Element with lowest frequency: " + minFreqElement + " (Frequency: " + minFreq + ")");
    }
}