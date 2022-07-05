package Java;

public class Child implements Father,Mother{

	public void height() {
		//child got average height of parents
		float ht=(Father.HT +Mother.HT)/2;
		System.out.println("Child height is :"+ht);
	}
}
