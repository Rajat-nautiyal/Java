public class objectArr {
    public static void main(String[] args){
        //making Array of objects
        food[] refrigerator = new food[3];

        food food1 = new food("pizza");
        food food2 = new food("coke");

        refrigerator[0] = food1;
        refrigerator[1] = food2;

        System.out.println(refrigerator[0].name);
    }
}
