package Abstract_design_pattern;

public class EmployeeFactory  {
	
	//get employee
	public static Employee getEmployee(EmployeeAbstractFactory Factory) {
		
		return Factory.createEmployee();
	}
	

}
