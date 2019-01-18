package level3;

import java.util.Scanner;

public class GCD {
	public static int gcd(int a,int b) {
		while(b!=0) {
			int r = a%b;
			a = b;
			b = r;
		}
		return a;
	}
	public static int lcm(int a,int b) {
		int result = a*b;
		result/=gcd(a,b);
		return result;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		System.out.println(gcd(n,m));
		System.out.println(lcm(n,m));
	}
}
