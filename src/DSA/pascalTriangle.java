package DSA;
import java.util.*;

public class pascalTriangle{
    public static int generateVar1(int n, int r, int col){
        List<List<Integer>> triangle = new ArrayList<>();
        for(int i = 0; i < n; i++){
            List<Integer> row = new ArrayList<>();
            for(int j = 0; j <= i; j++){
                if(j ==0 || j == i){
                    row.add(1);
                }else{
                    int value = triangle.get(i-1).get(j-1) + triangle.get(i-1).get(j);
                    row.add(value);
                }                
            }
            triangle.add(row);
        }
        int value = triangle.get(r-1).get(col-1);
        return value;
    }
    //variation 2
    public static List generateVar2(int n, int r ){
        List<List<Integer>> triangle = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            List<Integer> row = new ArrayList<>();
            for(int j = 0; j <= i; j++){
                if(j ==0 || j == i){
                    row.add(1);
                }else{
                    int value = triangle.get(i-1).get(j-1) + triangle.get(i-1).get(j);
                    row.add(value);
                }                
            }
            triangle.add(row);
        }
        for(int i = 0; i < r; i++ ){
            int value = triangle.get(r-1).get(i);
            list.add(value);
        }
        return list;
    }

    public static void main(String args[]){
        int n = 5;
        int r = 5;
        int col = 3;
        // int value = generateVar1(n, r, col);
        List<Integer> list = generateVar2(n, r);
        System.out.println(list);


    }
}