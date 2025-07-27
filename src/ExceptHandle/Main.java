package ExceptHandle;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("Enter no. one");
            int x = scanner.nextInt();
            System.out.println("Enter no. two");
            int y = scanner.nextInt();    
            int z = x/y;
		
			System.out.println("result: " + z);
        }catch(ArithmeticException e){
            System.out.println("you can't divide by zero");
        }catch(InputMismatchException e){
            System.out.println("PLEASE ENTER A NUMBER GEEZ!!");
        }catch(Exception e){
            System.out.println("Something went wrong");
        }finally{
            scanner.close();
        }

    }
}
