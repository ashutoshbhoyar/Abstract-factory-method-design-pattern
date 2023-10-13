package Abstract_design_pattern;

public class ManagerFactory extends EmployeeAbstractFactory{

	@Override
	public Employee createEmployee() {

		return new Manager();
	}

}
