package example1;

public class AbcEmployee extends Ems {

	@Override
	public void addEmployee() {
		// TODO Auto-generated method stub
		System.out.println("AbcEmp added to Oracle DB");
	}

	@Override
	public void updateEmployeeDetails() {
		// TODO Auto-generated method stub
		System.out.println("AbcEmp updated in Oracle Db");
	}

	@Override
	public void getEmployee() {
		// TODO Auto-generated method stub
		System.out.println("AbcEmp retrieved from Oracle DB");
	}

	@Override
	public void calculateEmployeeSalary() {
		// TODO Auto-generated method stub
		System.out.println("Abc Emp Salary calculated");
	}
	
	public void localAbcEmpBenifits() {
		System.out.println("This is explicit feature for Abc Employees ");
	}
}
