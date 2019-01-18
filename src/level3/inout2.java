package level3;

import java.util.Scanner;

public class inout2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[][] = new int[10][10];
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				a[i][j] = sc.nextInt();
			}
		}
		for(int k=0;k<n;k++) {
			for(int i=0;i<10;i++) {
				for(int j=0;j<10;j++) {
					if(i == k || j == k) {
						if(a[i][j] == 1) {
							a[i][j] = 0;
						}else {
							a[i][j] = 1;
						}
					}
				}
			}
		}
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}
}
