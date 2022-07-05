package Java;

public class Demo1 {

	public static void main(String[] args) {
		
		Person male = new Person();
		male.talk();
		
		Person female = new Person("ABC",25);
		
		Person custom = new Person("Sam",90);
	
	custom.talk();
	}
}
