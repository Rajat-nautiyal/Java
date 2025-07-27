import java.util.ArrayList;

public class arrList {
    public static void main(String[] args){

        // ArrayList = 	a resizable array. 
		//	Elements can be added and removed after compilation phase
		//	store reference data types
        ArrayList<String> food = new ArrayList<String>();
        food.add("mango");
        food.add("Apple");

        food.set(0, "samosa");
        // food.remove(1);
        // food.clear();
        for(int i=0; i <= food.size(); i++){
            System.out.println(food.get(i));
        }
    }
}
