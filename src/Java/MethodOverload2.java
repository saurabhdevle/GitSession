package Java;

public class MethodOverload2 extends MethodOverload1 {

	public static void main(String[] args) {
		
		MethodOverload2 mo2 = new MethodOverload2();
		
		mo2.sum(10, 20);
		mo2.sum(10, 20, 30);
		
	}
}
