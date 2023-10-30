package scanner;
//Take two different string input and print them in same line. 

import java.util.Scanner;

public class prb_8 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a word");
		String a=sc.nextLine();
		System.out.println("Enter a word");
		String b=sc.nextLine();
		System.out.println("OUTPUT "+a+b);
		sc.close();
	}

}
