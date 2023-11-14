package CandC;
//Write a Java program to display Pascal's triangle.

public class prb_9 {
	public static int factor(int i) {
		 if(i==0) {
			 return 1;}
		 else {
		 return i*factor(i-1);}
	}

	public static void main(String[] args) {
		for(int i=0;i<5;i++) {
			for(int j=0;j<5-i;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				
				System.out.print(" "+factor(i)/(factor(i-j)*factor(j)));
			}
			System.out.println(" ");
		}

	}

}
