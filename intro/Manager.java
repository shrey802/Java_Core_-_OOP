package intro;

public class Manager extends Employee{
	private String dept;
	Manager(String name, double salary, String dept){
		super(name, salary);
		this.dept = dept;
	}
	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println(" Department is " + dept);
	}
}
