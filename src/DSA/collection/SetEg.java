package DSA.collection;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.HashSet;
import java.util.TreeSet;

public class SetEg{
    public static void main(String[] args){
        // Set<Integer> set = new HashSet<>();
        // Set<Integer> set = new LinkedHashSet<>();
        // Set<Integer> set = new TreeSet<>(); //gives sorted array

        // set.add(10);
        // set.add(2);
        // set.add(50);
        // set.add(2); //duplication wont happen
        // System.out.println(set);
        // // set.remove(10);
        // System.out.println(set.contains(50)); //true or false
        // System.out.println(set.isEmpty());//true or false

        // System.out.println(set.size());// returns size (3)

        // set.clear();

        Set<Student> studentSet = new HashSet<>();
        // studentSet.add(new Student("Rajat", 5)); //uncomment then run
        // studentSet.add(new Student("Anuj", 2));
        // studentSet.add(new Student("Rajat", 5)); // Duplicate based on rollNo

        System.out.println(studentSet); // Prints unique students based on rollNo



    }
}
