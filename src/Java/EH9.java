package Java;

public class EH9 {

	public static void main(String[] args) {
		try {
			int a=30/2;
		System.out.println(a); //15
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("finally block is always executed");
		}
	}
}
