package encapsulation;

public class Main {
    //Encapsulation = attributes of the classed will be hidden or private,
    //                Can be accessed only through methods like getters & setters
    public static void main(String[] args){
        Car c = new Car("ford", "CC9",2024 );
        // System.out.println(c.getNameNmodel());

        c.setNameNmodel("honda", "cc7");
        c.setYear(2025);

        System.out.println(c.getNameNmodel() +" "+ c.getYear());
    }
}
