package level5;

import java.util.Scanner;

public class sequence {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t[][] = new int[n][n];
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				t[i][j] = sc.nextInt();
			}
		}
		for(int i=0;i<n;i++) {
			if(i == 0) {
				arr[i] = (t[i][i+1] + t[i][i+2] - t[i+1][i+2])/2;
			}else if(i == n-1) {
				arr[i] = (t[i-2][i] + t[i-1][i] - t[i-2][i-1])/2;
			}else {
				arr[i] = (t[i-1][i] + t[i+1][i] - t[i-1][i+1])/2;
			}
		}

		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		
		
		
	}
}
