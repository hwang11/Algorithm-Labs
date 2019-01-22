package level5;

import java.util.Scanner;

public class nextnum {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int a1 = sc.nextInt();
			int a2 = sc.nextInt();
			int a3 = sc.nextInt();
			if(a1 == 0 && a2 == 0 && a3 == 0) break;
			int r = 0;
			String ans="";
			int next = 0;
			
			if((a2 - a1) == (a3 - a2)) {
				r = (a2-a1);
				next = a3 + r;
				ans = "AP";
			}else if(a2/a1 == a3/a2) {
				r = a2/a1;
				ans = "GP";
				next = a3*r;
			}
			System.out.println(ans+" "+next);
			
		}
	}
}
