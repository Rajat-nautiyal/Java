import java.util.ArrayList;

public class forEach {
    public static void main(String[] args) {
			
		// for-each = 	traversing technique to iterate through the elements in an array/collection
		//				less steps, more readable
		//				less flexible
		
		//String[] animals = {"cat","dog","rat","bird"};
//When to Use Each Loop
//Use the traditional for loop when you need the index, to modify elements at specific indices.
//Use the foreach loop when you want simple and clean iteration over each element and don’t need the index
		ArrayList<String> animals = new ArrayList<String>();
		
		animals.add("cat");
		animals.add("dog");
		animals.add("rat");
		animals.add("bird");
		
		for(String i : animals) {
			System.out.println(i);
        }
    }
}
