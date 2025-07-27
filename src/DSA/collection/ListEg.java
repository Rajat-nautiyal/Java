package DSA.collection;

import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class ListEg {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();//linkedList
        list.add(20);
        list.add(10);
        list.add(30);
        list.set(2, 1000);
        System.out.println(list); // Expected output: [20, 10, 1000]

        List<Integer> ArrList = new ArrayList<>();//ArrayList(same methods as LinkedList)
        ArrList.add(10);
        ArrList.addAll(list);
        System.out.println(ArrList); // Expected output: [10,20, 10, 1000]
        ArrList.remove(0);
        //list.clear();           //This will remove all the elements from the list.

        for(Integer element: list){
            System.out.println("for-each loop element " + element);
        }
    }

}
