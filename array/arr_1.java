package array;

import java.util.Arrays;

public class arr_1 {
//	Write a Java program to sort a numeric array and a string array.

	public static void main(String[] args) {

		int[] a = { 54, 87, 23, 35 };
		String[] b = { "cat", "dog", "cow", "hen" };
		Arrays.sort(a);
		Arrays.sort(b);

		for (String string : b) {
			System.out.println(string);
		}

		for (int x : a) {
			System.out.println(x);
		}
	}

}
