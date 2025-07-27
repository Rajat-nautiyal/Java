public class overload {
    public static void main(String[] args) {
		
		// overloaded methods = methods that share the same name but have different parameters
		//						method name + parameters = method signature
		
		double x = add(1.0,2.0);
		
		System.out.println(x);
		
	}
	
	static int add(int a, int b) {
		System.out.println("This is overloaded method #1");
		return a + b;
	}
	static int add(int a, int b, int c, int d) {
		System.out.println("This is overloaded method #3");
		return a + b + c + d;
	}
	static double add(double a, double b) {
		System.out.println("This is overloaded method #4");
		return a + b;
	}

}
