package example_inheritance_composition;

public class Employee extends Person{

	private String orgName;
	private String designation;
	private double salary;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public String getOrgName() {
		return orgName;
	}
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Employee(int id,String name,String orgName, String designation, double salary) {
		super(id,name);
		this.orgName = orgName;
		this.designation = designation;
		this.salary = salary;
	}
	
	public void printEmployee() {
		System.out.println("Employee details are");
		super.printPerson();
		System.out.println("Organization Name : "+orgName);
		System.out.println("Designation : "+designation);
		System.out.println("Salary : "+salary);
	}
}
