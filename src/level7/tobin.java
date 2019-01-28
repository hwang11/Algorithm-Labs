package level7;

import java.util.LinkedList;
import java.util.Scanner;

public class tobin {
	static int n,k;
	static boolean v[];
	static int a[] = {1,0};
	static LinkedList<Integer> li = new LinkedList<Integer>();
	public static void t(int cnt,int k1) {
		if(cnt == n) {
			if(k1 == k) {
			for(int i=0;i<li.size();i++) {
				System.out.print(li.get(i));
			}
			System.out.println();
			return;
			}
			else return; //여기서 return을 안해주면 cnt는 계속 증가되서 오버플로 
			//return 해줘야 cnt-1일 때로 돌아감 
		}
		for(int i=0;i<2;i++) { // 0과 1 두개 뿐이므로 i<2까지 
			if(k1 <= k) {
				if(i==0) {
					li.add(1);
					t(cnt+1,k1+1);
					li.removeLast();
				}
				else {
					li.add(0);
					t(cnt+1,k1);
					li.removeLast();
				}
			}
			else break;
		}


	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		k = sc.nextInt();
		v = new boolean[2];
		t(0,0);
	}
}
