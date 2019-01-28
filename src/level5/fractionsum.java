package level5;

import java.util.Scanner;

public class fractionsum {
	public static int gcd(int a,int b) {
		int r = a%b;
		while(r>0) {
			a = b;
			b = r;
			r = a%b;
		}
		return b;
	}
	public static int lcm(int a,int b) {
		int sum = a*b;
		return sum/gcd(a,b);
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a1 = sc.nextInt();
		int b1 = sc.nextInt();
		int a2 = sc.nextInt();
		int b2 = sc.nextInt();
		int r1,r2; //r1 분모 r2 분자 
		
		r1 = r2 = 0; 
		
		r1 = lcm(b1,b2);
		int t1,t2;
		t1 = (r1/b1);

		a1 = a1*t1;
		t2 = (r1/b2);

		a2 = a2*t2;
		r2 = a1+a2;
		int d=gcd(r1,r2);
		r1/=d;
		r2/=d;
		System.out.println(r2+" "+r1);
		
		
	}
}
