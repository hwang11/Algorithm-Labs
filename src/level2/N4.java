package level2;

import java.util.ArrayList;
import java.util.Scanner;

public class N4 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		ArrayList<Integer> primeList = new ArrayList<Integer>();
		boolean isprime[] = new boolean[m+1];
		for(int i=2;i<=m;i++) {
			isprime[i] = true;
		}
		for(int i=2;i<=m;i++) {
			if(!isprime[i]) continue;
			else primeList.add(i);
			for(int j=i*2;j<=m;j+=i) { //i의 2배부터 i만큼씩 증가.
				isprime[j] = false;
			}
		}
		for(int i=0;i<primeList.size();i++) {
			if(primeList.get(i)>=n) {
				System.out.print(primeList.get(i)+" ");
			}
		}
	}
}
