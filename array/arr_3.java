package array;

import java.util.ArrayList;

//Write a Java program to find common elements between two integer arrays.

public class arr_3 {

	public static void main(String[] args) {
		int[] a = { 54, 87, 23, 35 };
		int[] b = { 78, 87, 23, 38 };
		ArrayList<Integer> match=new ArrayList<Integer>();
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				if(a[i]==b[j])
					match.add(a[i]);
			}
		}
		System.out.println(match);
	}

}
