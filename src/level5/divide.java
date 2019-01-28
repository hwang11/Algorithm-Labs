package level5;

import java.util.Scanner;

public class divide {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int cnt = 0;
		int r = n-m;
		int f,t,ten,k,sum;
		f = t = ten = sum = 1;
		for(int i=r;i<=n;i++) {
			k = i;
			for(int j=2;k>1;) {
				if(k%j == 0) {
					//System.out.println(i+"의 소인수: "+j);
					k /=j;
				}else {
					j++;
				}
			}
		}
		for(int i=2;n>1;) {
			if(n%i == 0) {
				if(i == 2) t++;
				if(i == 5) f++;
				//System.out.println(i);
				n/=i;
			}else {
				i++;
			}
		}
		cnt = Math.min(t, f);
		System.out.println(cnt);
	}
}
