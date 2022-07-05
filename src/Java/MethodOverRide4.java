package Java;

public class MethodOverRide4 extends MethodOverRide3{
	
	public void run() {
		
		System.out.println("XYZ is running");
	}
	
	public static void main(String[] args) {
		
		MethodOverRide4 mo4 = new MethodOverRide4();
		mo4.run();
		
		MethodOverRiding2 mo2 = new MethodOverRiding2();
		mo2.eat();
		
		MethodOverRide3 mo3 = new MethodOverRide3();
		mo3.run();
		
	}

}
