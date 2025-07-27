public class App {
    public static void main(String[] args){
        String lang = "java";
        hello(lang);
        int z = add(2,3);
        System.out.println(z);
    }
    static void hello(String lang) {
        System.out.println("Hello "+ lang);
    }
    static int add(int a, int b){
        int z = a + b;
        return z;
    }
}
