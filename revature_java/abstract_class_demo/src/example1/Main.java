package example1;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Accessing EMS with AbcEmployee object");
		AbcEmployee a=new AbcEmployee();
		a.localAbcEmpBenifits();
		a.calculateEmployeeSalary();
		a.addEmployee();
		a.commonEmployeeBenifits();
		a.getEmployee();
		System.out.println(a.hashCode());
		a.updateEmployeeDetails();
		
		System.out.println("Accessing EMS with XyzEmployee object");
		//Code here for XyzEmployee
	}

}
