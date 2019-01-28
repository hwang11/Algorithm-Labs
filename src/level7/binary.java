package level7;

import java.util.Scanner;

public class binary {
	public static void b(int x) {
		if(x == 1) System.out.print(1);
		else if(x == 0) System.out.print(0);
		else {
			b(x/2);
			System.out.print(x%2);
		}
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		b(n);
	}
}
