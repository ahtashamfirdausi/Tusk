
public class Test1 {
	
	public Test1(int b) {
		System.out.println("q");
	}
	
	public Test1(float a) {
		System.out.println("r");
	}
	
	public Test1(double a) {
		System.out.println("p");
	}

	public static void main(String[]args) {
		Test1 t = new Test1(5);
	System.out.println(t);
	}
}
