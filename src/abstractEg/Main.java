package abstractEg;

public class Main {
    public static void main(String[] args) {
    	// abstract =  	abstract classes cannot be instantiated, but they can have a subclass instantiated
		//				abstract methods are declared without an implementation
        //Vehical vehical = new Vehical(); //parent class cannot be instantiated

        Car c = new Car();
        c.go();
    }
}
