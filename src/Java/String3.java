package Java;

public class String3 {

	public static void main(String[] args) {
		
		System.out.println("Hash Code for String");
	
		String str = "java";
		System.out.println(str.hashCode());
		str=str+"Selenium";
		System.out.println(str.hashCode());
		
		System.out.println("Hashcode  for String buffer");
	
		StringBuffer sb = new StringBuffer("Java");
		System.out.println(sb.hashCode());
		sb.append("Selenium");
		System.out.println(sb.hashCode());
	}
}
