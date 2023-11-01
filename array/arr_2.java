package array;


//Write a Java program to remove a specific element from an array.

public class arr_2 {

	public static void main(String[] args) {
		int[] a = { 54, 87, 23, 35 };
		for (int i=0;i<4;i++) {
			if(a[i]==23)
				a[i]=0;
		}
		for (int i : a) {
			System.out.println(i);
		}

	}

}
