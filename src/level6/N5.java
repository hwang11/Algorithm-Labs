package level6;

import java.util.Scanner;

public class N5 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		int cnt = 0;
		int i,j;
		i = j = 0;
		while(true) {
			if(i>=s1.length() || j >= s2.length()) break;
			if(s1.charAt(i) == s2.charAt(j)) { 
				i++;
				j++;
				cnt++;
			}
			else {
				cnt = 0;
				i++;
			}

		}
		if(cnt == s2.length()) System.out.println("YES");
		else System.out.println("NO");

	}
}
