package mn223dn_assign4;

import java.util.*;

public class RandomWalk {
	

	private int max;
	private int size;
	private int x;
	private int y;
	private int stepCounter;

	public RandomWalk(int inputMax, int inputSize) {
		max = inputMax;
		size = inputSize;
	}

	public String currentPosition() {
		return "(" + x + "," + y + ")";
	}

	public int remainStep() {
		return max - stepCounter;
	}

	public String toString() {
		String a = " The number of steps taken so far: " + stepCounter;
		String b = " The current position: " + currentPosition();
		return a + "\n" + b;
	}

	public int stepCount() {
		return stepCounter;
	}

	public void takeStep() {
		stepCounter++;
		Random rand = new Random();
		int dir = 1 + rand.nextInt(4);
		if (dir == 1){
			y++;}
		if (dir == 2){
			y--;}
		if (dir == 3){
			x++;}
		if (dir == 4){
			x--;}

	}

	public boolean moreStep() {
		if (max > stepCounter)
			return true;
		return false;
	}

	public boolean inBound() {
		if (x <= size && x >= -size && y <= size && y >= -size)
			return true;
		return false;
	}

	public void walk() {
		while (inBound() == true && moreStep() == true){
			takeStep();
		}
			
	}
}