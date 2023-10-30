package operators;
//Write a program to reverse a 3-digit number. 

import java.util.Scanner;

public class prb_6 {

	public static void main(String[] args) {
		System.out.println("Enter a 3 digit number");
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		StringBuilder sb=new StringBuilder(a);
		sb.reverse();
		int b=Integer.parseInt(sb.toString());
		System.out.println("The reversed number will be "+b);
		sc.close();
	}

}
