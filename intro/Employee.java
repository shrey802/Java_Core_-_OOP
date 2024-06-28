package intro;

public class Employee {
	// private vars nobody can access
//	private String name;
//	private int age;
//	
//	Employee(String name, int age){
//		this.name = name;
//		this.age = age;
//	}
//	
//	public void setName(String name) {
//		this.name = name;
//	}
//	
//	public String getName() {
//		return name;
//	}
//	
//	public void setAge(int age) {
//		this.age = age;
//	}
//	
//	public int getAge() {
//		return age;
//	}
	
	
	
	
	
	
	// dynamic polymorphism
	protected double salary;
	protected String name;
	Employee(String name, double salary){
		this.name = name;
		this.salary = salary;
	}
	
	public void calculateMonthlysalary() {
		System.out.println("Monthly salary is " + salary/12);
	}
	
	public void displayDetails() {
		System.out.println(" name is " + name);
		System.out.println(" salary is " + salary);
	}
		
	
}
