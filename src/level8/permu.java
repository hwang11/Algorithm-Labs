package level8;

import java.util.LinkedList;
import java.util.Scanner;

public class permu {
	static int n,r;
	static boolean v[];
	static LinkedList<Integer> li;
	public static void p(int cnt) {
		if(cnt == r) {
//			for(int i=0;i<n;i++) { 이렇게만 할경우에 순차적으로 출력하므로 ba가 나와야 하는 경우에도 ab가 나와버림.
//				if(v[i]) System.out.print((char)(i+97));
//			}
			for(int i=0;i<li.size();i++) { //여기서는 리스트의 순서대로 출력됨! 
				System.out.print((char)(li.get(i)+97));
			}
			System.out.println();
		}
		else {
			for(int i=0;i<n;i++) {
				if(!v[i]) {
					v[i] = true;
					li.add(i);
					p(cnt+1);
					v[i] = false;
					li.removeLast();
				}
			}
		}
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		r = sc.nextInt();
		v = new boolean[n];
		li = new LinkedList<Integer>();
		p(0);
	}
}
