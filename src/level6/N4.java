package level6;

import java.util.Arrays;
import java.util.Scanner;

public class N4 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s[] = new String[n+1];
		for(int i=0;i<=n;i++) {
			s[i] = sc.nextLine();
		}
		
		Arrays.sort(s);
		
		for(int i=1;i<=n;i++) {
			System.out.println(s[i]);
		}
	}
}
