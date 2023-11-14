package CandC;

public class prb_7 {

	public static void main(String[] args) {
		for(int j=1;j<=4;j++) {
			for(int x=4-j;x>0;x--) {
				System.out.print(" ");
			}
			for(int i=1;i<=j;i++) {
				System.out.print(j+" ");
			}
			System.out.println(" ");
		}

	}

}
