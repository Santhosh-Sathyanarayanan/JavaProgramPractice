package JavaProgrammingPractice;

import java.util.ArrayList;
import java.util.Collections;

public class MoveNegativeToStartOfArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> nos= new ArrayList<Integer>();
		nos.add(8);nos.add(-9);nos.add(5);nos.add(-1);nos.add(-7);nos.add(2);nos.add(1);
		System.out.println(nos);
		Collections.sort(nos);
		System.out.println(nos);
	}

}
