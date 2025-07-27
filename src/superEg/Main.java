package superEg;

public class Main {
    public static void main(String[] args){
    // super = 	keyword refers to the superclass (parent) of an object
	//			very similar to the "this" keyword

    Hero hero1 = new Hero("Superman",21,"strength");
    System.out.println(hero1.display());
    
    hero1.funcDisplay();

    }
}
