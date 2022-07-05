package Java;

public class MethodOverRide7 {

	public static void main(String[] args) {
		
		//Assigning parent class refer
		
		MethodOverRide5 mo5 = new MethodOverRide6();
		mo5.cook(); // child class method will get execute only if method is present in parent class
		
		mo5.eat();  //Parent class method 
		
		// mo5.angry(); // its not follow dynamic method dispatch 
	
	}
	
	
}
