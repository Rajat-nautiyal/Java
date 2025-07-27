package inheritance;

public class Main {
    public static void main(String[] args){
        Vehical v = new Vehical();
        v.go();
        
        Car c = new Car();
        // c.lost(); //marking it comment cuz vscode giving error sign but proper output
        
        Bike b = new Bike();
        // b.go();
        System.out.println(b.door);

    }
}
