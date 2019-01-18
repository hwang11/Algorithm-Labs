package level3;

import java.util.Scanner;

public class attrackrange {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt()-1;
		int y = sc.nextInt()-1;
		int r = sc.nextInt();
		String a[][] = new String[n][n];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				a[i][j] = "0";
			}
		}
		for(int k=1;k<=r;k++) {
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					if(Math.abs(i-x) + Math.abs(j-y) == k) {
						a[i][j] = Integer.toString(k);
					}
				}
			}
		}
		
		a[x][y] = "x";
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}
