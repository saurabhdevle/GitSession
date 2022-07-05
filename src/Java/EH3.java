package Java;

public class EH3 {

	public static void main(String[] args) {
		
	try {
		int c=5/0;
	}catch(ArithmeticException a) {
		System.out.println(a);
	}catch(ArrayIndexOutOfBoundsException b) {
		System.out.println(b);
	}catch (Exception e) {
		System.out.println(e);
	}
	System.out.println("Exception get Handled");
	
	}
}
