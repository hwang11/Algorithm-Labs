package level3;

import java.util.Scanner;

//검증수.
public class N3 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];
		int sum = 0;
		for(int i=0;i<5;i++) {
			int v = sc.nextInt();
			sum += Math.pow(v, 2);
		}
		sum %=10;
		System.out.println(sum);
	}
}
