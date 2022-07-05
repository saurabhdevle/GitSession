package Java;

abstract class Car {

	//Every car have reg num

	int regNo;
	
	Car(int r){
		regNo = r;
	}
	
	// all  cars will have a fuel tank
	void openTank() {
		System.out.println("Fill the tank");
	}
	
	//all cars will have steering
	abstract void steering(int direction, int angle);
	
	//all cars have break
	abstract void breaks(int force);
	

}
