package Java;

public class MethodOverRide10 {

	public static void main(String[] args) {
		
		MethodOverRide9 mo9 = new MethodOverRide9();
		mo9.m1();  //B-M1
		mo9.m2();  //B-M2
		mo9.m3("Jai Ram Ji Ki"); //A-M3 String
		mo9.m3(); // A-M3 No Param
		mo9.m3(42.f, 76); // B-M3 float int param
	
	
	MethodOverRide8 mo8 = new MethodOverRide9();
	
	mo8.m1(); //A-M1 // Parent class method is execute bcoz we use static
	mo8.m2();  //B-M2
	mo8.m3("pqr"); // A-M3 String parameter
	mo8.m3(); //
	
	
	}
	
}
