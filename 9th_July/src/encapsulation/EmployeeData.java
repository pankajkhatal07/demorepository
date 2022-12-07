package encapsulation;

public class EmployeeData {
	
	private String name;
	private int age;
	private int RollNo;
	private int sal;

	public static void main(String[] args) {
		
		EmployeeData emp = new EmployeeData();
		emp.setName("Pankaj");
		emp.setRollNo(7);
		emp.setAge(27);
		emp.setSal(110000);
		
		
		System.out.println("Emp Name : "+emp.getName());
        System.out.println("Emp age : "+emp.getAge());
        System.out.println("Emp roll_no : "+emp.getRollNo());
        System.out.println("Emp sal : "+emp.getSal());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getRollNo() {
		return RollNo;
	}

	public void setRollNo(int rollNo) {
		RollNo = rollNo;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

}
