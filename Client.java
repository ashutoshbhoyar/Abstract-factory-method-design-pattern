package Abstract_design_pattern;

public class Client {
	public static void main(String[] args) {
		// I want android developer object
		Employee emp1 = EmployeeFactory.getEmployee(new AndroidDevFactory());
		System.out.println(emp1.name());
		System.out.println(emp1.salary());

		// I want web developer object
		Employee emp2 = EmployeeFactory.getEmployee(new WebDevFactory());
		System.out.println(emp2.name());
		System.out.println(emp2.salary());
		
		// I want manager object
		Employee emp3 = EmployeeFactory.getEmployee(new ManagerFactory());
		System.out.println(emp3.name());
		System.out.println(emp3.salary());
	}

}
