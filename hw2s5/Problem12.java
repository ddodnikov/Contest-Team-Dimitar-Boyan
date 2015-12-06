package hw2s5;

public class Problem12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int i=0,j=0,k=0;
		for (i=1;i<10;) {
			if (i!=9 && j!=9)
				System.out.print(i);
			for ( ;j<10;j++) {
				if (j==i)
					continue;
				if (i!=9 && j!=9)
					System.out.print(j);
				for ( ;k<10;k++) {
					if (k==i || k==j)
						continue;
					else if ( i==9 || j==9) {
						if (i==8 && j==9 && k==0) {
							System.out.print(j+""+k+"\n");
							break;
						}
						System.out.print(i+""+j+""+k+"\n");
					}
					else if (j==9)
						System.out.print(j+""+k+"\n");
					else 
						System.out.print(k+"\n");
					break;
				}
				if (k==9 || k==10) {
					j++;
					k=-1;
				}
				k++;
				break;
			}
			if (j>9) {
				i++;
				j=0;
			}
		}
	}

}
