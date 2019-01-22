package level5;

import java.util.Scanner;

public class prosjek {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		int ans[] = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		ans[0] = a[0];
		int result = 0,sum = 0;
		for(int i=2;i<=n;i++) {
			sum = 0;
			for(int j=0;j<i-1;j++) {
				sum += ans[j];
			}
			ans[i-1] = a[i-1]*i - sum;
		}
		for(int i=0;i<n;i++) {
			System.out.print(ans[i]+" ");
		}
		
		
	}
}
