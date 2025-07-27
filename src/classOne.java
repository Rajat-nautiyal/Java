public class classOne {
    public static void main(String[] args){
        Car car1 = new Car("blue", 2010, 12);

        System.out.println(car1.color);
        System.out.println(car1.number);
        System.out.println(car1.age);
        car1.sound();

    }
}
