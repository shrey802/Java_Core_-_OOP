package intro;

public class Human {
	// constructor syntax
//	Human(){
//		params and methods and properties
//	}
	
	String name;
	int age;
	double height;
	double weight;
	
	
	Human(String name, int age, double height, double weight){
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.age = age;
	}
	
	void eat() {
		System.out.println(name + " is eating");
	}
	
}
