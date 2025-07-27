import java.util.*;

public class nestedloop{
    public static void  main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter no. of rows");
        int rows = scanner.nextInt();
        System.out.println("enter no. of column");
        int col = scanner.nextInt();
        System.out.println("enter a symbol");
        String sym = scanner.next(); //next() is used for strings

        for(int i =1; i<=rows; i++){
            System.out.println();// println displays on new line
            for(int j =1; j<=col; j++){
                System.out.print(sym);// print() displays on same line
            }
        }
    }
}