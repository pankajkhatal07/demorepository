package encapsulation;

public class Differentclass {

	public static void main(String[] args) {
		
		
		EmployeeData emp = new EmployeeData();
		
		emp.setAge(25);
		emp.setName("Anup");
		emp.setRollNo(1);
		emp.setSal(120000);
		
		System.out.println("Emp Name : "+emp.getName());
        System.out.println("Emp age : "+emp.getAge());
        System.out.println("Emp roll_no : "+emp.getRollNo());
        System.out.println("Emp sal : "+emp.getSal());

	}

}
