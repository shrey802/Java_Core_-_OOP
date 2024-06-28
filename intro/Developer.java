package intro;

public class Developer extends Employee {
	private String lang;
	Developer(String name, double salary, String lang){
		super(name, salary);
		this.lang = lang;
	}
	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println(" Programming Language is " + lang);
	}
}
