package Java;

public class EH2 {

	public static void main(String[] args) {
		
		try {

			int c = 3/0;
		}catch(ArithmeticException a) {
			System.out.println(a);
		}

		System.out.println("Exception Handled");
	
	
		for (int i=0;i<=5;i++) {
			System.out.println(i);
		}
	}
}
