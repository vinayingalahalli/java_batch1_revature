package example_basic;

public class RequirementsImpl  implements RequirementA,RequirementB,RequirementB.Inner{

	@Override
	public void requirement1() {
		// TODO Auto-generated method stub
		System.out.println("Requirement 1 accomplished");
	}

	@Override
	public void requirement2() {
		// TODO Auto-generated method stub
		System.out.println("Requirement 2 accomplished");
	}

	@Override
	public void requirement3() {
		// TODO Auto-generated method stub
		System.out.println("Requirement 3 accomplished");
	}

	@Override
	public void requirement4() {
		// TODO Auto-generated method stub
		System.out.println("Requirement 4 accomplished");	
	}

	@Override
	public void requirement5() {
		// TODO Auto-generated method stub
		System.out.println("Requirement 5 accomplished");
	}

	@Override
	public void commonRequirement() {//solving diamond problem
		// TODO Auto-generated method stub
		System.out.println("Common solution given");
		System.out.println("x = "+x);
		//x++;
	}

	@Override
	public void innerRequirement() {
		// TODO Auto-generated method stub
		System.out.println("Inner requirement accomplished of RequirementB");
	}

}
