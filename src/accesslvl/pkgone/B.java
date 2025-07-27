package accesslvl.pkgone;
// import accesslvl.pkgone.*;

public class B {
    public static void main(String[] args){
        A a = new A();
        System.out.println(a.Var1); //accessible

        // System.out.println(a.Var2); //Not Accessible, even on being a subclass of A
        System.out.println(a.Var3); //Accessible
    }

}
