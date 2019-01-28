package level6;

import java.util.Scanner;

public class N3 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		char a[] = new char[st.length()];
		for(int i=0;i<st.length();i++) {
			a[i] = st.charAt(i);
		}
		for(int i=st.length()-1;i>=0;i--) {
			System.out.print(a[i]);
		}
	}
}
