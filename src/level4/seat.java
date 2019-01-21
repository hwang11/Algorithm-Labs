package level4;

import java.util.Scanner;

public class seat {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		int r = sc.nextInt();
		int num = sc.nextInt();
		
		int a[][] = new int[r][c];
		int i=r,j=0,k=0,sw=-1,r1=r,c1=c-1;
		
		while(true) {
			for(int l = 0; l<r1; l++) {
				k = k + 1;
				i = i + sw;
				a[i][j] = k;
			}
			sw *=-1;
			r1 = r1-1;
			if(c1 <= 0) break;


			for(int m = 0; m<c1;m++) {
				k = k+1;
				j = j+sw;
				a[i][j] = k;
			}
			c1 = c1-1;
			if(r1 <= 0) break;

		}
		for(int o=0;o<r;o++) {
			for(int y=0;y<c;y++) {
				System.out.print(a[o][y]+" ");
			}
			System.out.println();
		}
		for(int o=0;o<r;o++) {
			for(int y=0;y<c;y++) {
				if(a[o][y] == num) {
					System.out.println("답:"+(y+1)+" "+(r-o));
				}
			}
		}

		
	}
}
