package interfaceEg;

public class Main {
    public static void main(String[] args){
        //classes can apply more than 1 interfaces
        fish f = new fish();
        f.notPredator();
        f.hunt();

        hawk h = new hawk();
        h.hunt();
    }
}
