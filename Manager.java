package Abstract_design_pattern;

public class Manager implements Employee {

	@Override
	public int salary() {
		System.out.print("my salary is");
		return 100000;
	}

	@Override
	public String name() {
		System.out.print("I am : ");
		return "Manager";
	}

}
