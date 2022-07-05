package Java;

public class EH4 {

	public static void main(String[] args) {
		
		try {
			String s=null;
			System.out.println(s.length());
		}catch(Exception e) {
			//e.printStackTrace();
		System.out.println(e);
		}
		System.out.println("Exception get handled");
	}
}
