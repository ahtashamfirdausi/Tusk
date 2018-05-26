
public class Testencap implements Interface{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("firdausi is eating");
	}

	@Override
	public void animal() {
		// TODO Auto-generated method stub
		System.out.println("firdausi is an animal");
		
	}
	
	public static void main (String[] args) {
		Testencap en = new Testencap();
		en.eat();
		en.animal();
	}
}
