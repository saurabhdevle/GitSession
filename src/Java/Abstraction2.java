package Java;

class Abstraction2 extends Abstraction1 {

	@Override
	void a() {
	System.out.println("a method execute");
		
	}
	
	public static void main(String[] args) {
		
		Abstraction2 ab2 = new Abstraction2();
	ab2.a();
	
	}
	

}
