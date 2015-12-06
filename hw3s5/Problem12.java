package hw3s5;
import java.util.Scanner;

public class Problem12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int[] array = new int[7];
		for (int i=0;i<7;i++) {
			System.out.print("array["+i+"]= ");
			array[i]=sc.nextInt();
		}
		// [0] and [1]
		int helper;
		helper=array[0];
		array[0]=array[1];		
		array[1]=helper;
		// [2] and [3] ; I see no way of doing this solely with the operation (+), presuming I can use it's counterpart (-)
		array[2]+=array[3];
		array[3]=array[2]-array[3];
		array[2]=array[2]-array[3];
		// [4] and [5] ; I see no way of doing htis solely with the operation (*), presuming I can use it's counterpart (/)
		array[4]*=array[5];
		array[5]=array[4]/array[5];
		array[4]/=array[5];
		for (int i=0;i<7;i++) {
			System.out.println("array["+i+"]= "+array[i]);
		}
	}

}
