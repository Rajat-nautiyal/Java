import java.util.Random;

public class random {
    public static void main(String[] args){
        Random random = new Random();
        int x = random.nextInt(6)+1; //random no. anywhere blw 1 and 6
        System.out.println("random no. is "+ x);

        double y = random.nextDouble(); //random no. anywhere blw 0 and 1
        System.out.println("random no. is "+ y);

        boolean z = random.nextBoolean();
        System.out.println("random boolean is "+ z);
        
        
    }
}