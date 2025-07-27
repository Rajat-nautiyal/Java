package interfaceEg;

public class fish implements predator,prey {
    @Override
    public void notPredator(){
        System.out.println("Fish are preys");
    }
    @Override
    public void hunt(){
        System.out.println("fish are hunters too");
    }
}
