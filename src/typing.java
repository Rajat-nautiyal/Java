import java.util.Scanner;

public class typing{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String x = scanner.nextLine();
        if(x.equals("Q")||x.equals("q")){ //literals must be " "
            System.out.println("you typed right char");
        }else{
            System.out.println("wrong character");
        }
        
    }
}