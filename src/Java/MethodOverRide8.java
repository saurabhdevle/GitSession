package Java;

public class MethodOverRide8 {

	static void m1() {
		System.out.println("A-M1");
	}
	
	void m2() {
		System.out.println("A-M2");
	}
	
	static void m3() {
		System.out.println("A-M3 No Parameter");
	}
	
	int m3(String s) {
		System.out.println("A-M3 String parameter");
		return 50;
	}
}
