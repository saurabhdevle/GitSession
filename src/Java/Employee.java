package Java;

public class Employee {

	//private data variable
	
	// public getter and setter method : to set and get the values of the field
	
	public int getSsn() {
		return ssn;
	}
	public void setSsn(int ssn) {
		this.ssn = ssn;
	}
	public String getEnpName() {
		return enpName;
	}
	public void setEnpName(String enpName) {
		this.enpName = enpName;
	}
	public int getEmpAge() {
		return empAge;
	}
	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}
	
	//make variable private: so that these variables  can not access directly outside of the class
	private int ssn;
	private String enpName;
	private int empAge;
	
	public static void main(String[] args) {
		
		Employee emp = new Employee();
		emp.setEmpAge(30);
		emp.setSsn(123);
		emp.setEnpName("XYZ");
	
	
	System.out.println("Employee name :" + emp.getEnpName());
	
	System.out.println("Employee age :" + emp.getEmpAge());
	
	System.out.println("Employee SSN :" + emp.getSsn());
	}
	
}
