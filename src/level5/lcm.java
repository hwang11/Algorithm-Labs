package level5;

import java.util.Scanner;

public class lcm {
	public static long gcd(long a,long b) {
		long r = a%b;
		while(r > 0) {
			a = b;
			b = r;
			r = a%b;
		}
		return b;
	}
	public static long lcm(long a,long b) {
		long t = a*b;
		return t/gcd(a,b);
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextInt();
		long b = sc.nextInt();
		System.out.println(lcm(a,b));
	}
}
