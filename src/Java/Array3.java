package Java;

public class Array3 {

	public static void main(String[] args) {
		
		//declare and initialization
		
		int a[][] = {{1,2,3},{4,5,6}};
		
		//total num row
		
		int row = a.length;
		System.out.println(row);  //2
		
		//total num of col
		
		int col = a[0].length;
		System.out.println(col); //3
		
		//outer loop
		for(int i=0;i<row;i++) {
			//inner loop
			
			for(int j=0;j<col;j++) {
				System.out.print(a[i][j] + " ");
			}
		System.out.println();
		}
	

	}

}
