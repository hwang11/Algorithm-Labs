package level6;

import java.util.Scanner;

public class N1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		char a[] = new char[st.length()];
		for(int i=0;i<st.length();i++) {
			a[i] = st.charAt(i);
			if(a[i]-64 > 0 && a[i]-64<27) { //대문자 
				a[i] = (char) (a[i]+32);
			}
			else if(a[i]-64>32 && a[i]-64<59) { //소문자 
				a[i] = (char)(a[i]-32);
			}
			else {
				continue;
			}
		}
		for(int i=0;i<st.length();i++) {
			System.out.print(a[i]);
		}
	
	}
}
