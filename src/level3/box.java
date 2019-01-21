package level3;

import java.util.Scanner;

public class box {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		int map[] = new int[7]; //1부터 시작하려고 
		int v = 0;
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
 		}
		
		for(int j=1;j<=6;j++) { //기준 면.
			map[j] = a[j];
			for(int k=1;k<=6;k++) {
				if(j == 1) {
					map[j] 
				}
			}
		}
		
	}
}
