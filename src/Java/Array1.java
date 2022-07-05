package Java;

public class Array1 {
	
	public static void main(String[] args) {
		
		int arr[] = new int[5];// declaration of array
		
		arr[3]=1;
		arr[1]=2;
		arr[2]=3;
		arr[0]=6;
		arr[4]=5;
		
		System.out.println(arr.length); // length of array
		
		//print all array element 
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
