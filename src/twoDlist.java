import java.util.ArrayList;

public class twoDlist {
    public static void main(String[] args){

        //2d arrayList
        ArrayList<ArrayList<String>> groceryList = new ArrayList();

        ArrayList<String> junkFood = new ArrayList();
        junkFood.add("kurkure");
        junkFood.add("pizaa");
        junkFood.add("pasta");

        ArrayList<String> homeFood = new ArrayList();
        homeFood.add("maida");
        homeFood.add("aata");
        homeFood.add("rice");

        ArrayList<String> liquid = new ArrayList();
        liquid.add("mineral_water");

        groceryList.add(junkFood);
        groceryList.add(liquid);
        groceryList.add(homeFood);

        System.out.println(groceryList.get(0).get(2));
    }
}
