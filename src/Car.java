public class Car {
    String color = "yellow";
    String model = "RTX50";
    int number;
    int age;
    Car(String color , int number, int age){
        this.color = color;
        this.number = number;
        this.age = age;
    }
    void sound (){
        System.out.println(this.number + "wrmm wrmm");
    }
}
