package Java;

 class Maruti extends Car{

	 Maruti(int regNo){
		 super(regNo);
	 }
	 
	 void steering(int direction, int angle) {
		// System.out.println("Take a turn");
	 System.out.println("This is ordinary steering ");
	 
	 }
	 
	 void breaks(int force) {
		 System.out.println("These are hydraulic break");
	 }
	
}
