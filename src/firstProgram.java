import java.util.Scanner;

public class firstProgram {
    public static void main(String[] args){
        System.out.println("whats your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("whats your age?");
        double age = scanner.nextDouble();

        System.out.println("hi "+name);
        age = (double) age/2;
        System.out.println("your age is "+age);
        scanner.close();
    }
}
