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
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
			if(map.containsKey(a[i])) {
				num = map.get(a[i]);
				num++;
				map.replace(a[i], num);
			}
			else {
				num = 1; // num = 0으로 초기화 해뒀었는 데 그럼 max도 0이니까
				//두개를 비교못하는 상황생기고, 그리고 하나 추가됐는데 1로 초기화 하는 게 맞음 
				map.put(a[i], num);
			}
 		}
		boolean flag = true;
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
		if(cnt1>=3) {
			if(cnt1==3) {
				if(cnt2 ==3) flag = true;
				else flag = false;
			}
		}
		else {
			flag = false;
		}
		if(flag) System.out.println("YES");
		else System.out.println("NO");
	}
}
