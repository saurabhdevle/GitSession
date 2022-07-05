package Java;

public class MethodOverRiding2  extends MethodOverRiding1{
	
	public void eat() {
	System.out.println("You are eating");	
	}
	
	public static void main(String[] args) {
		
		MethodOverRiding2 mo2 = new MethodOverRiding2();
		mo2.eat();
		
		MethodOverRiding1 mo1 = new MethodOverRiding1();
		mo1.eat();
		
	}

	
}
