package scanner;
//Write a program to take two integer inputs from user and print sum and product of them.

import java.util.Scanner;

public class prb_7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int a=sc.nextInt();
		System.out.println("Enter another number");
		int b=sc.nextInt();
		System.out.println("Sum of numbers "+(a+b));
		System.out.println("Product of numbers "+a*b);
		sc.close();

	}

}
