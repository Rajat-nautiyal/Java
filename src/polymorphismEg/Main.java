package polymorphismEg;

public class Main{
    public static void main(String[] args){
        // polymorphism = 	greek word for poly-"many", morph-"form"
		//					The ability of an object to identify as more than one type
		//Dynamic polymorhphism :- after compilation(during runtime)
		Car car = new Car();
		boat boat = new boat();
        
        Vehical[] racers = {car, boat};

        for(Vehical x: racers){
            x.go();
        }
    }
}