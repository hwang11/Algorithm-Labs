package level5;

import java.util.Scanner;

//0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610
public class fibonacci {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a1 = 1;
		int a2 = 1;
		int a3 = 0;
		if(n == 0) System.out.println(0);
		if(n == 1 || n == 2) System.out.println(1);
		if(n > 3) {
			for(int i=0;i<n-2;i++) {
				a3 = a1 + a2;
				a1 = a2;
				a2 = a3;
			}
			System.out.println(a3);
		}
		
		
	}
}
