import java.util.Scanner;

public class Sides{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter side x");
        Float x = scanner.nextFloat();
        System.out.println("Enter side y");
        Float y = scanner.nextFloat();

        Float hypotenuse = (float) Math.sqrt(x*x + y*y);//math.sqrt returns double so typecasted it in float
        System.out.println("Hypotenuse is " + hypotenuse);
        scanner.close();
        
    }
}