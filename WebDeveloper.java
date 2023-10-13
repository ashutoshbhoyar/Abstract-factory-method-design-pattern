package Abstract_design_pattern;

public class WebDeveloper implements Employee {

	@Override
	public int salary() {
		System.out.print("My salary is : ");
		return 5000;
	}

	@Override
	public String name() {
		System.out.print("I am : ");
		return "Web Developer";
	}

}
