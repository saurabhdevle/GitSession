package Java;

public class Inheritance4 extends Inheritance3{

	public void multification(int x,int y) {
		z=x*y;
		System.out.println("Multification is :" +z);
	}
	
	public void division(int x,int y) {
		z=x/y;

		System.out.println("division is :" +z);
	}

	
	public static void  main(String[] args) {
		int x=20;
		int y=10;
		
		Inheritance4 i4 = new Inheritance4();
		i4.addition(x, y);
		i4.subtraction(x, y);
		i4.multification(x, y);
		i4.division(x, y);
		
	}
	
}
