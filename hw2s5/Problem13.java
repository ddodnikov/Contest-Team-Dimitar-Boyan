package hw2s5;
import java.util.Scanner;

public class Problem13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("n= ");
		n=sc.nextInt();
		for (int i=1;i<10;i++) {
			int sum=i;
			if (sum==n) {
				System.out.print(i+"00\n");
				sum=0;
				continue;
			}
			for (int j=0;j<10;j++) {
				sum=i+j;
				if (sum==n) {
					System.out.print(i+""+j+"0\n");
					sum=0;
					break;
				}
				for (int k=0;k<10;k++) {
					sum=i+j+k;
					if (sum==n) {
						System.out.print(i+""+j+""+k+"\n");
						sum=0;
						break;
					}
				}
			}
		}
	}

}
