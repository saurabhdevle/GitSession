package Java;

public class UseCar {

	public static void main(String[] args) {
		
		//Santro s = new Santro(1001);
		//Maruti m = new Maruti(1002);
		
		//creating a ref to super class : car
		
		//Car ref;
		
		//to use Maruti Car
		//ref=m;
	   
		Car ref = new Maruti(1002);
		ref.openTank();	
		ref.steering(10, 10);
		ref.breaks(500);
	}
}
