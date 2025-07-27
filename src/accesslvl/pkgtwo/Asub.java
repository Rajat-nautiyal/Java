package accesslvl.pkgtwo;
import accesslvl.pkgone.*;

public class Asub extends A{
    public static void main(String[] args){
        A a = new A();
        // System.out.println(a.Var1); //not accessible
        // System.out.println(a.Var3); //not accessible
    }
}
