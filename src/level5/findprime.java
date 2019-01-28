package level5;

import java.util.Scanner;

public class findprime {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		int cnt = 0;
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		boolean isPrime[] = new boolean[1001];
		for(int i=2;i<=1000;i++) {
			isPrime[i] = true;
		}
		for(int i=2;i<=1000;i++) {
			if(isPrime[i]) {
				for(int j=i*2;j<=1000;j+=i) {
					isPrime[j] = false;
				}
			}
		}
		for(int i=0;i<n;i++) {
			if(isPrime[a[i]]) cnt++;
		}
		System.out.println(cnt);
		
	}
}
