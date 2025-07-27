package DSA;
import java.util.Scanner;

public class reverseNo {
    // if input is 155 , output-> 551
    //if input is 1500, output -> 51
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int temp = n;
        int temp1;
        int revNo = 0;
        while(temp>0){
            temp1 = temp%10;
            temp = temp/10;
            revNo = revNo*10 + temp1;
        }
        System.out.println(revNo);
    }
}
