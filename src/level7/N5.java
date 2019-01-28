package level7;

import java.util.Scanner;

public class N5 {
	public static void f(int n) {
		if(n == 1) System.out.print(1+" ");
		else {
			f(n-1);
			System.out.print(n+" ");
			f(n-1);
		} 
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		f(n);
	}
}
