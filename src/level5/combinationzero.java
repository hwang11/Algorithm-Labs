package level5;

import java.util.Scanner;

public class combinationzero {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
//		long r = 1;
//		long i = 10;
//		long cnt = 0;
//		while(r>0) {
//			if(n%i == 0) {
//				cnt++;
//				r=n/i;
//				i*=10;
//			}else break;
//		}
// 		System.out.println(cnt);
		
		int m = sc.nextInt();
		int cnt = 0;
		int r = n-m;
		int f,t,ten;
		f = t = ten = 0;
		for(int i=r;i<=n;i++) {
//			if(i%5 == 0) {
//				System.out.println("5: "+i);
//				f++;
//			}
//			if(i%2 == 0) {
//				System.out.println("2:"+ i);
//				t++;
//			}
			if(i%10 == 0) {
				ten++;
			}
		}
		System.out.println(ten);
//		cnt = Math.min(f, t);
// 		System.out.println(cnt-ten);
//		for(int i=2;n>1;i++) {
//			if(n%i == 0) {
//				System.out.println(i);
//				n /=i;
//			}else {
//				i++;
//			}
//		}
	}
}
