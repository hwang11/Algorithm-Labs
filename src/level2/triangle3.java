package level2;

import java.util.Scanner;

public class triangle3 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int p=1;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i-1;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<p;j++) {
				System.out.print("*");
			}
			p+=2;
			System.out.println();
		}
	}
}
