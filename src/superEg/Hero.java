package superEg;

public class Hero extends Person {
    String power;

    Hero(String name, int age, String power){
        super(name,age); //refers to Person constructor
        this.power = power;
    }
    String display(){
        return this.name +" "+ this.age + " " + this.power;
    }
    void funcDisplay(){
        System.out.println(super.displayHero());
    }
}
