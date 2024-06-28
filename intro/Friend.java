package intro;

public class Friend {
	String name;
	static int numberOfFriends;
	// class that contains the static variable owns the static member
	Friend(String name){
		this.name = name;
		numberOfFriends++;
	}
	
	static void displayFriends() {
		System.out.println("You have " + numberOfFriends + " friends");
	}
}
