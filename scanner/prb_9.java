package scanner;
//Write a Java Program to swap two numbers using the third variable.

import java.util.Scanner;

public class prb_9 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st number");
		int a=sc.nextInt();
		System.out.println("Enter 2nd number");
		int b=sc.nextInt();
		int c=a;
		a=b;
		b=c;
		System.out.println("Current 1st number "+a);
		System.out.println("Current 2nd number "+b);
		sc.close();
	}

}
