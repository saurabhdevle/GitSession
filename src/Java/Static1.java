package Java;

public class Static1 {

	
	int roll; //non static global variable
	String name;//non sttaic global variable
	static String branch; // static global variable
	
	public Static1(int r, String n) {
	
		roll=r;
		name=n;
	}
	
	public void getResult() {
		System.out.println(roll+ " "+name+" "+branch);
	}
}
