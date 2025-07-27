package DSA.hashing;
import java.util.*;

class hash {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("enter no. in array");
            arr[i] = sc.nextInt();
        }

        //precompute:
        int[] hash = new int[13];
        for (int i = 0; i < n; i++) {
            hash[arr[i]] += 1;
        }

        int q;
        System.out.println("enter total no. of elements in query ");
        q = sc.nextInt();
        while (q-- != 0) {
            int number;
            System.out.println("enter no. in query");
            number = sc.nextInt();
            // fetching:
            System.out.println(hash[number]);
        }
    }
}
