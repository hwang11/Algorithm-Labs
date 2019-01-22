package level5;

import java.util.Scanner;

public class sequence {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t[][] = new int[n][n];
		int a[] = new int[n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				t[i][j] = sc.nextInt();
			}
		}
		
		
	}
}
