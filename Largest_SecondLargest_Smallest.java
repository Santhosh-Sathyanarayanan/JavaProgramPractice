package JavaProgrammingPractice;

import java.util.ArrayList;

public class Largest_SecondLargest_Smallest {
	public static void main(String[] args) {
		ArrayList<Integer> nos= new ArrayList<Integer>();
		nos.add(32);nos.add(9);nos.add(25);nos.add(68);nos.add(7);nos.add(71);nos.add(61);
		System.out.println(nos);
		//[32, 9, 25, 68, 7, 71, 61]
		int largest=nos.get(0);
		int smallest=nos.get(0);
		int second_largest=nos.get(0);
		for(int i=1;i<nos.size();i++) {
			int a=nos.get(i);
			if(a>largest) {
				second_largest=largest;
				largest=a;
			}
			else if(a<smallest){
				smallest=a;
			}
		}
		System.out.println(largest+" "+second_largest+" "+smallest);
	}

}
