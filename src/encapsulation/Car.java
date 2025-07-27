package encapsulation;

public class Car {
    private String name, model;
    private int year;

    Car(String name, String model, int year){
        this.name = name;
        this.model = model;
        this.year = year;
    }
    public String getNameNmodel(){
        return name + " " + model;
    }
    public int getYear(){
        return year;
    }
    public void setNameNmodel(String name, String model ){
        this.name = name;
        this.model = model;
    }
    public void setYear(int year){
        this.year = year;
    }

}
