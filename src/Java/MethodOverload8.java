package Java;

public class MethodOverload8 {

	public void sum(int a, int b) {
		System.out.println(a+b);
	}
	
	public void sum(long a, long b) {
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		MethodOverload8 mo8 = new MethodOverload8();
		mo8.sum(20,30);
		mo8.sum(20l, 20);
		
	}
}
