package array;


// Write a Java program to find a missing number in an array.
public class arr_5 {

	public static void main(String[] args) {
		int [] a = { 1,2,3,4,5,6,8 };
		int n=a[a.length-1];
		int sum=0;
		int s=(n*(n+1))/2;
		for (int i=0;i<a.length;i++) {
			sum=a[i]+sum;
		}
		
		
		
		
		System.out.println(s-sum);

	}

}
