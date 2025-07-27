public class StaticExample {
    // Static variable
    static int counter = 0;
    String name;

    // Constructor
    public StaticExample(String name) {
        this.name = name;
        counter++; // Increment counter whenever a new object is created
    }

    // Static method
    public static int getCounter() {
        return counter; // Accessing static variable
    }
    
    public void displayInfo() {
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        // Accessing static method without creating an object
        System.out.println("Initial Counter: " + StaticExample.getCounter());

        // Creating objects
        StaticExample obj1 = new StaticExample("Alice");
        StaticExample obj2 = new StaticExample("Bob");

        obj1.displayInfo();
        obj2.displayInfo();

        // Accessing static method after creating objects
        System.out.println("Final Counter: " + StaticExample.getCounter());
    }
}
