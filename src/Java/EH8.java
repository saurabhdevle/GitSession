package Java;

public class EH8 {

	public static void main(String[] args) {
		try {
			int b=10/0;
		}finally {
			System.out.println("This will execute always");
		}
	}
	
}
