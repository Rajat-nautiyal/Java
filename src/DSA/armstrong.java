package DSA;
import java.util.Scanner;

public class armstrong {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter no.");
        int n = scanner.nextInt();

        int temp = n;
        int temp1 = 0;
        int count = (int) Math.log10(n) + 1;
        int[] val = new int[count];
        int result = 0;

        for(int i=0; i<val.length; i++){
            temp1 = temp%10 ;
            val[i] = temp1;
            temp = temp/10;		
            // result = result + val[i]^count; // incorrect
            result = result + (int)Math.pow(val[i], count); //Math.pow(base, exponent) , to get valuein power
            // System.out.println(result);
        }
        if (result == n) {
            System.out.println(n + " is an Armstrong number.");
        } else {
            System.out.println(n + " is not an Armstrong number.");
        }
        scanner.close();

    }
}
