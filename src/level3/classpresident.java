package level3;

import java.util.Scanner;

public class classpresident {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[][] = new int[n][5];
		for(int i=0;i<n;i++) {
			for(int j=0;j<5;j++) {
				a[i][j] = sc.nextInt();
			}
		}
		int k;
		int p[] = new int[n];
		
		for(int m=0;m<n;m++) {
			for(int j=0;j<5;j++) {
				k = a[m][j];
				for(int i=0;i<n;i++) {
					if(m == i) continue;
					if(k == a[i][j]) p[i]++;
				}
			}
		}

		int max = 0;
		int ans = 0;
		for(int i=0;i<n;i++) {
			if(max < p[i]) {
				max = p[i];
				ans = i;
			}
			else if(max == p[i]) {
				if(ans>i) ans = i;
			}
			System.out.println("p"+p[i]);
		}
		System.out.println((ans+1));
	}
	
}
