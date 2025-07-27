package superEg;

public class Person {
    
    String name;
    int age;
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    String displayHero(){
        return "Parent class(Person) is running from Hero class";
    }
}
