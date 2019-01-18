package level3;

import java.util.Scanner;

public class Car {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt = 0;
		for(int i=0;i<5;i++) {
			int v = sc.nextInt();
			if(v == n) cnt++;
		}
		System.out.println(cnt);
	}
}
