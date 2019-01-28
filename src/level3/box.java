package level3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class box {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		int v = 0;
		HashMap<Integer , Integer> map = new HashMap<Integer , Integer>();
		int num = 0;
		boolean flag = false;
		if(n < 6) flag = false;
		else {
			for(int i=0;i<n;i++) {
				a[i] = sc.nextInt();
				if(map.containsKey(a[i])) {
					num = map.get(a[i]);
					num++;
					map.replace(a[i], num);
				}
				else {
					num = 1; 
					map.put(a[i], num);
				}
	 		}
			int cnt1 = 0;
			int cnt2 = 0;
			Iterator<Integer> keys = map.keySet().iterator();
			while(keys.hasNext()) {
	            Integer key = keys.next();
	            cnt1++;
	            if(map.get(key) >= 2) {
	            	cnt2++;
	            }

			}
			//cnt1 색의 수
			//cnt2 색이 몇번있는지 
			
			if(cnt1>=3) { //3,4,5...
				if(cnt1 == 3) {
					if(cnt2 == 3) flag = true;
				}
				else if(cnt1 == 4) {
					if(cnt2 >= 2) flag = true;
				}
				else flag = true;
			}
			else { //1,2
				flag = false;
			}
		}
		
		if(flag) System.out.println("YES");
		else System.out.println("NO");
	}
}
