package Java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringBuffer1 {

	public static void main(String[] args) throws Exception {

		//access the String from keyword
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the String :");
		String str=br.readLine();
		
		String temp=str;
		
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb);
		
		sb.reverse();
		str=sb.toString();
		
		if(temp.equalsIgnoreCase(str)) {
			
			System.out.println(temp+"is palidrome");
			
		}else {
			System.out.println(temp+ "is not palidrome");
		}
		

	}

}
