package example1;

public abstract class Ems {

	public abstract void addEmployee();
	
//	public void hello() {
//		System.out.println("Hello");
//	}
	
	public abstract void updateEmployeeDetails();
	public abstract void getEmployee();
	public abstract void calculateEmployeeSalary();
	
	public void commonEmployeeBenifits() {
		System.out.println("This common employee benifits given by any Employer");
	}
	
}
