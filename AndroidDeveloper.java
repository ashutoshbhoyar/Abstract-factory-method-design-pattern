package Abstract_design_pattern;

public class AndroidDeveloper implements Employee {

	@Override
	public int salary() {
		System.out.print("My salary is : ");
		return 50000;
	}

	@Override
	public String name() {
		System.out.print("I am : ");
		return "Android Developer";
	}

}
