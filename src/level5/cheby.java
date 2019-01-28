package level5;

import java.util.Arrays;
import java.util.Scanner;

public class cheby {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		boolean isPrime[];
		while(true) {
			int cnt = 0;
			int n = sc.nextInt();
			isPrime = new boolean[2*n+1];
			Arrays.fill(isPrime, true);
			for(int i=2;i<=n*2;i++) {
				if(isPrime[i]) {
					for(int j=i*2;j<=n*2;j+=i) {
						isPrime[j] = false;
					}
				} 
			}
			if(n == 0) break;
			for(int i=n+1;i<=2*n;i++) {
				if(isPrime[i]) cnt++;
			}
			System.out.println(cnt);
		}
	}
}
