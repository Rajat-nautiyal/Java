package DSA.sorting;
import java.util.*;

class Q3 {
    // Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        
        for(int num: a){
            set.add(num);
        }
        for(int num: b){
            set.add(num);
        }
        for(int num: set){
            System.out.print(num);
            list.add(num);
        }
        return list;
    }
    public static void main(String args[]){
        int[] a = {1,4,5}; //hashset gives sorted array but only for +ve integers
        int[] b = {3,4,5}; 
        ArrayList<Integer> list = findUnion(a, b);
        for(int num: list){
            System.out.print(num + " ");
        }
    }
}
