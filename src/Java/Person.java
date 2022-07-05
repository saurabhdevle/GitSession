package Java;

public class Person {

	//instance variable
	public String name;
	public int age;
	
	//default constructor
	Person(){
		name="Monu";
		age=35;
	}
	
	//parameterized constructor
	Person(String s, int i){
		name=s;
		age=i;
	}
	
	//Method
	
	void talk() {
		System.out.println("Hello I am " +name);

	System.out.println("My age is " +age);
	}
}
