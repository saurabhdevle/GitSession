package Java;

public class EH5 {
public static void main(String[] args) {
	
	String y="Hello";
	String x="Saurabh";
	try {
		int i= Integer.parseInt(x);
	}catch(Exception e) {
		System.out.println(e);
	}
	System.out.println("Exception Handled");
}
}
