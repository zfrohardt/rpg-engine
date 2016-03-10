package rpgrandom;

import java.util.Random;

public class Dice {
	private Random rand;
	private int ceiling;
	private int lastRoll;
	
	public Dice(int n) {
		if(n < 2) {
			throw new IllegalArgumentException("Dice may not be lower than d2");
		}
		
		rand = new Random();
		ceiling = n;
		lastRoll= 0;
	}
	
	public int roll() {
		lastRoll = rand.nextInt(ceiling) + 1;
		return lastRoll;
	}
	
	public int lastRoll() {
		return lastRoll;
	}
}