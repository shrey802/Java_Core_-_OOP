package intro;

public class Pizza {
	String bread;
	String sauce;
	String cheese;
	String toppings;
	Pizza(String bread, String sauce, String cheese, String toppings){
		this.bread = bread;
		this.cheese = cheese;
		this.sauce = sauce;
		this.toppings = toppings;
	}
	
	Pizza(String bread, String sauce, String cheese){
		this.bread = bread;
		this.cheese = cheese;
		this.sauce = sauce;
	}
	
}
