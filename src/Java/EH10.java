package Java;

public class EH10 {

	public static void main(String[] args) {
		eligibility(15);
		eligibility(16);
		
	}
	
	public static void eligibility(int age) {
		if(age<18) {
			throw new ArithmeticException("No valid");
		}else {
				System.out.println("Eligible for voting");
	}
}
}