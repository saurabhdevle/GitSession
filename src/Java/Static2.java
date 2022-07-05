package Java;

public class Static2 {

	public static void main(String[] args) {
		
		Static1 s1= new Static1(1,"Ram");
		Static1 s2 = new Static1(2,"Shayam");
		Static1 s3 = new Static1(3,"Geeta");
		Static1.branch = "Computer Science";
		
		s1.getResult();
		s2.getResult();
		s3.getResult();
		
		
	}
}
