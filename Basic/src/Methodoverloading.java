
public class Methodoverloading {

	public static int add(int a, int b) {
		return a+b;
	}
	
	public static double add(double a, double b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		Methodoverloading md = new Methodoverloading();
		System.out.println(md.add(12, 14));
		System.out.println(md.add(12.33, 13.33));
	}
}
