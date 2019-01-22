package level5;

import java.util.Scanner;

public class beehive {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = 2;
		int r = 0;
		int cnt = 0;
		while(true) {
			if(n <= k) {
				System.out.println(cnt+1);
				break;
			}
			r+=6;
			k+=r;
			cnt++;
		}
	}
}
