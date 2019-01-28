package level6;

import java.util.LinkedList;
import java.util.Scanner;

public class N2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		LinkedList<Character> li = new LinkedList<Character>();
		for(int i=0;i<st.length();i++) {
			if(st.charAt(i) != ' ') li.add(st.charAt(i));
		}
		for(int i=0;i<li.size();i++) {
			System.out.print(li.get(i));
		}
	}
}
