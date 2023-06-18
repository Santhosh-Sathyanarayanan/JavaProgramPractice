package JavaProgrammingPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MoveNegativeToStartOfArray {
	public static void main(String[] args) {
		int[] arr = { 5, -2, 23, 7, 87, -42, 509 };
        System.out.println("The original array is: "+arr);
        Arrays.sort(arr);
       System.out.println("\nThe sorted array is: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
	}
}
