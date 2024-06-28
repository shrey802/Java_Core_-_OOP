package intro;
import java.util.*;

public class DiceRoller {
	int number;
	Random random = new Random();
	DiceRoller(){
		random = new Random();
		roll();
	}
	
	void roll() {
		number = random.nextInt(6)+1;
		System.out.println(number);
	}
}
