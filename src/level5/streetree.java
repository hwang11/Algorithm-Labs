package level5;

import java.util.Scanner;

public class streetree {
	public static int gcd(int a,int b) {
		int r = a%b;
		while(r>0) {
			a = b;
			b = r;
			r = a%b;
		}
		return b;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		int r[] = new int[n-1];
		for(int i=0;i<n-1;i++) {
			r[i] = a[i+1]-a[i];
		}
		int t = gcd(r[0],r[1]);
		for(int i=1;i<n-1;i++) {
			t = gcd(r[i],t);
		}
		int sum = 0;
		for(int i=0;i<n-1;i++) {
			sum += (r[i]/t)-1;
		}
		
		System.out.println(sum);
		
	}
}
