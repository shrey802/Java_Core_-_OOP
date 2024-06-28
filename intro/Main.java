package intro;
import java.util.*;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
//		System.out.println("What you learning?");
//		System.out.println("Good");
		
		// this is a comment
		
		/*
		 this is a multiline comment
		 */
//		primitive datatypes have 8 types of datatypes
//		reference datatypes are user defined
//		can hold 1 value in primitive
//		multiple values in references
//		primitve stores data
//		reference stores address
		
//		int x = 123;
//		double y = 3.14;
//		String greet = "Hello Wordl\n"; // reference datatype
//		boolean zee = false;
//		char symbol = '#';
//		System.out.print(symbol);
//		System.out.println("\nNumber is:"+y);
		
		
		// swap 2 variables using Java
		
//		char x = '#';
//		char temp;
//		char y = '@';
//		
//		System.out.println(x);
//		System.out.println(y);
//		
//		System.out.println("Swapped");
//		
//		temp = x;
//		x = y;
//		y = temp;
//		
//		System.out.println(x);
//		System.out.print(y);
		
//		Scanner input = new Scanner(System.in);
//		System.out.print("\n Enter your favourite food?");
//		String food = input.nextLine();
//		
//		System.out.println("Favourite Food is: " + food);
		// if scanner is looking for some other datatype and we enter other datatype we get exception error
		
		// expressions in Java 
		
//		float alpha = 20.34f;
//		System.out.println(alpha);
//		--alpha;
//		System.out.println(alpha);
//		alpha++;
//		System.out.println(alpha);
//		
//		System.out.println((double)alpha%2);
		
		// basic GUI in java
		
//		String name = JOptionPane.showInputDialog("Enter your name");
//		JOptionPane.showMessageDialog(null, "Hello" + name);
//		
//		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
//		JOptionPane.showMessageDialog(null, "Damn you're old" + age);
//		
//		double val = Double.parseDouble(JOptionPane.showInputDialog("Enter height"));
//		JOptionPane.showMessageDialog(null, "Height is " + val);
		
		// MATH CLASS METHODS
//		double x;
//		double y;
//		double hypo;
//		Scanner input = new Scanner(System.in);
//		System.out.println("Enter side x:");
//		
//		x = input.nextDouble();
//		System.out.println("Enter side y:");
//		y = input.nextDouble();
//		
//		hypo = Math.sqrt((x*x)+(y*y));
//		System.out.println(hypo);
		
		
		// random values in Java
		
//	Random random = new Random();
//	int y = random.nextInt(6)+1;
//	double x = random.nextDouble();
//	boolean z = random.nextBoolean();
//	System.out.print(z);
		
		// if else
		
//	int age = 20;
//	if(age>18) {
//		System.out.print("Ahh finally");
//	}else if(age == 18){
//		System.out.print("Maybe");
//	}else {
//		System.out.print("Nope");
//	}
		
		// switches
	  
//	String day = "Pizza";
//	switch(day) {
//	case "Sunday":
//		System.out.print("It's Sunday finally");
//		break;
//	case "Friday":
//		System.out.print("Its a Friday");
//		break;
//	case "Monday":
//		System.out.print("Ughh");
//		break;
//	default:
//		System.out.print("Not a day");
//	}
//		
		
		
		// logical operators
		
//	Boolean legal = true;
//	int age = 19;
//	if(legal==true && age>18) {
//		System.out.print("Fine you can do it");
//	}else if(legal !=false || age > 18){
//		System.out.print("Nope bro");
//	}
	
//	Scanner scanner = new Scanner(System.in);
//	System.out.println("You're playing a game");
//	String res = scanner.next();
//	if(res.equals("q") || res.equals("Q")) {
//		System.out.print("Quitting the game");
//	}else {
//		System.out.print("sTILL PLAYING");
//	}
		
//		int age = 15;
//		while(age!=18) {
//			System.out.println("not 18 yet");
//			age++;
//		}
		
//		Scanner scanner = new Scanner(System.in);
//		String name = "";
//		while(name.isBlank()) {
//			System.out.print("Enter your name");
//			name = scanner.nextLine();
//		}
//		System.out.println("Hello "+name);
		
		
		// for loop in JAVA
		
//	for(int i=10; i>=0; i--) {
//		System.out.println(i);
//		
//	}
//	System.out.println("Happy New Year");
		
		
		// nested loop
		
//	Scanner scanner = new Scanner(System.in);
//	int rows;
//	int cols;
//	String symbol = "";
//	System.out.println("Enter number of rows");
//	rows = scanner.nextInt();
//	System.out.println("Enter number of columns");
//	cols = scanner.nextInt();
//	System.out.println("Enter symbol to use");
//	symbol = scanner.next();
//	
//	for(int i=0; i<=rows; i++) {
//		System.out.println();
//		for(int j=i; j<=cols; j++) {
//			System.out.print(symbol);
//		}
//	}
	
		// arrays
		
//		String[] cars = {"Inova", "Toyota", "Corvette"};
//		cars[2] = "Mustang";
//		System.out.print(cars[0]);
//	Scanner scanner = new Scanner(System.in);
//	String[] cars = new String[3];
//	
//	for(int i=0; i<cars.length; i++) {
//		System.out.println("Enter car names");
//		cars[i] = scanner.nextLine();
//	}
//	
//	System.out.println(cars[0]);
		
		
//	String[][] cars = new String[3][3];
//	cars[0][0] = "Corvette";
//	cars[0][1] = "Innova";
//	cars[0][2] = "Falcon2.0";
//	cars[1][0] = "Mustang";
//	cars[1][1] = "BMW";
//	cars[1][2] = "Tata";
//	cars[2][0] = "AUDI";
//	cars[2][1] = "LAMBO";
//	cars[2][2] = "FERRARI";
//			
//			
//		for(int i=0; i<cars.length; i++) {
//			System.out.println();
//			for(int j=0; j<cars[i].length; j++) {
//				System.out.print(cars[i][j]+" ");
//			}
//		}
//		
		
		
		//string methods
		
//	String name = "Bro";
//	System.out.print(name.indexOf("B"));
		
		
		// ARRAYLIST - resizable array
		
//	ArrayList<String> strarr = 
//			new ArrayList<String>();
//	
//	strarr.add("Homie");
//	strarr.add("Thug");
//	strarr.add("Glock");
//	strarr.set(0, "Broski");
//	strarr.remove(2);
////	strarr.clear();
//	for(int i=0; i<strarr.size(); i++) {
//		System.out.println(strarr.get(i));
//	}
	
		
		// 2D ARRAYLIST 
		
	
//	ArrayList<ArrayList<String>> groceryList = new ArrayList();
//	
//	ArrayList<String> strarr = 
//	new ArrayList<String>();
//
//strarr.add("Homie");
//strarr.add("Thug");
//strarr.add("Glock");
//strarr.set(0, "Broski");
//
//groceryList.add(strarr);
//		
//		System.out.print(groceryList.get(0).get(1));

		// for each in JAVA
		
//	String[] animals = {"cat", "rat", "mouse", "dog"};
//	for(String animal: animals) {
//		System.out.println(animal);
//	}
	
//		double x = 5.51;
//		double y = 32.23;
//		double sum = add(x,y);
//		System.out.print(sum);
		
		
//		printf() -> display text in console
//		2 arguments - string and variable/value/object
//		% flags precision width conversion character
		
//		System.out.printf("This is a %d string", 123);
		
//		System.out.printf("%b\n", true);
//		System.out.printf("%c\n", '@');
//		System.out.printf("Hello %s", "shreyash");
//		System.out.printf("%d\n", 25);
//		System.out.printf("%f", 1000.00);
		//width
//	System.out.printf("Hello %20s", "shreyash");
		// precision
//		System.out.printf("%.4f", 1000.00);
		
//		System.out.printf("%,f", 1000.00);
//		System.out.printf("%+f", 1000.00);
		
		
		// final keyword
		
	// if we use final keyword we cannot change or update value
		
//		final double pi = 3.14;
//		System.out.print(pi);
		
		
		
		
		
		
		
		
//		OOP START
		
		// diff class into another class and 
//		accessing properties and methods of 
//		other class in other class
		
		
//		Car myCar = new Car();
//		Car secondCar = new Car();
//		myCar.brake();
//		secondCar.drive();
//		secondCar.brake();
//		myCar.drive();
		
		
		// CONSTRUCTORS
	
//		Human human = new Human("Shreyash", 65, 240.00, 87.5);
//		human.eat();
//		
//		Human human2 = new Human("Aaryan", 21, 45.87, 432.4);
//		human2.eat();
		
		
		
		// VARIABLE SCOPE 
		
//		DiceRoller diceroll = new DiceRoller();

		
		// OVERLOADED CONSTRUCTORS
		
//		constructor name + params = signature
				
//			Pizza pizza = new Pizza("Garlic", "tomato", "mozerrela", "chilly");
//			System.out.println("Here are the ingridients of the pizza");
//			System.out.println(pizza.bread);
//			System.out.println(pizza.toppings);
//			
//			Pizza pizza2 = new Pizza("Homie", "vegan", "cheddar");
//			System.out.println(pizza2.bread);
//			System.out.println(pizza2.cheese);
		
		
		
		// TO STRING
		
//		Car myCar = new Car();
//		System.out.print(myCar.toString());
		
		
		// ARRAY OF OBJECTS
		
//		Food[] khana = new Food[5];
		
//		Food food1 = new Food("Hamburger");
//		Food food2 = new Food("Lauki");
//		Food food3 = new Food("Tomato");
//		Food[] khana = {food1, food2, food3};
////		khana[0] = food1;
////		khana[1] = food2;
////		khana[2] = food3;
//		
//		System.out.print(khana[0].name);
		
		
		
		// OBJECT PASSING TO DIFF CLASSES
		
//		Garage garage = new Garage();
//		Car car = new Car("BMW", 12);
//		Car car2 = new Car("Tesla", 13);
//		garage.Park(car);
//		garage.unPark(car);
//		
//		garage.Park(car2);
//		garage.unPark(car2);
		
		
		// static keyword is a single copy of 
		// variable or method and is a modifier
//		Friend friend1 = new Friend("Spongebob");
//		Friend friend2 = new Friend("Patrick");
//		Friend friend3 = new Friend("Rick");
//		Friend.displayFriends();
		
		
		
		
		
		// INHERITANCE
		
		
//		Car car = new Car();
//		// car.go();
//		
//		Bicycle bike = new Bicycle();
//		// bike.stop();
//		
//		System.out.println(car.wheels);
//		System.out.println(bike.pedals);
		
		
		// METHOD OVERRIDING
		
//		Dog dog = new Dog();
//		dog.speak();

		// super keyword
		
//		Hero hero1 = new Hero("Batman", 42, "money");
//		System.out.print(hero1.toString());
		
		// abstract keyword
		
		// Vehicle vehi = new Vehicle();
		
// abstract classes cannot be called in other classes 
// the methods and vars in abstract classes that are termed as abstract
// can be called in subclasses of abstract but not in main class and the abstract methods should be overridden

//		Car car = new Car();
//		car.go();
		
		
// access modifier - private public protected
		
		
		// encapsulation
//		Employee emp = new Employee("Bar", 20);
//		emp.setAge(30);
//		System.out.print(emp.getName());
		
		
//		BankAccount bank = new BankAccount("Hitesh", "1132423");
//		
//		bank.setBalance(10000);
//		bank.getTransactions();
//		bank.setAccountHoldername("Nilesh");
//		bank.setAccountNumber("783258");
//		System.out.println(bank.getAccountHoldername());
//		System.out.println(bank.getAccountNumber());
//		bank.setBalance(23487);
//		System.out.println(bank.getBalance());
//		bank.getTransactions();
//		bank.withDrawal(1000);
//		bank.getTransactions();
//		System.out.println(bank.getBalance());
//		
		
		// INTERFACES - template for class 
		
//		Rabbit rab = new Rabbit();
//		rab.flee();
//		Hawk haw = new Hawk();
//		haw.hunt();
//		Fish fis = new Fish();
//		fis.hunt();
//		fis.flee();
//		
		
		// POLYMORPHISM
		
//		Shape cir = new Circle(2);
//		Shape rec = new Rectangle(5, 7);
//		Shape sq = new Sqaure(3,5);
//		
//		cir.draw();
//		rec.draw();
//		sq.draw();
//		
		
		
		// DYNAMIC POLYMORPHISM
		
//		Employee manager = new Manager("rick", 80000.00, "marketing");
//		Employee dev = new Developer("Shrey", 60000.77, "javascript");
//		manager.displayDetails();
//		manager.calculateMonthlysalary();
//		System.out.println();
//		dev.displayDetails();
//		dev.calculateMonthlysalary();
		
	
		// exception handling
		
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("Enter a number to divide");
			int x = scanner.nextInt();
			System.out.println("Enter a number to divide");
			int y = scanner.nextInt();
			int z = (x/y);
			System.out.println("result " + z);
		}catch(ArithmeticException e) {
			System.out.println("You can't divide by 0");
		}
		catch(InputMismatchException e) {
			System.out.println("Please enter a number OMG");
		}
		catch(Exception e) {
			System.out.println("Something went wrong!!");
		}finally {
			scanner.close();
		}
		
		
	}
	
	
	// methods in JAVA functions
	
	// return type methodname(){}
	
//	static int add(int num1, int num2) {
//		return num1+num2;
//	}

	// overload methods - METHODS THAT HAVE SAME NAME BUT DIFFERENT PARAMETERS
	
	
//	static int add(int num1, int num2) {
//		return num1 + num2;
//	}
//	
//	static float add(float num1, float num2) {
//		return num1+num2;
//	}
//	
//	static double add(double num1, double num2) {
//		return num1+num2;
//	}
//	
	
	
	
}




