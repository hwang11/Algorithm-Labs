package level3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class bin {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		HashMap<Integer , Integer> map = new HashMap<Integer , Integer>();
		int ans1,ans2,num,max,sum,k;
		ans1 = ans2 = num = max = k = sum = 0;
		for(int i=0;i<10;i++) {
			k = sc.nextInt();
			sum+= k;
			if(map.containsKey(k)) {
				num = map.get(k);
				num++;
				map.replace(k, num);
			}
			else {
				num = 1; // num = 0으로 초기화 해뒀었는 데 그럼 max도 0이니까
				//두개를 비교못하는 상황생기고, 그리고 하나 추가됐는데 1로 초기화 하는 게 맞음 
				map.put(k, num);
			}

		}
		Iterator<Integer> keys = map.keySet().iterator();
        while( keys.hasNext() ){
            Integer key = keys.next();
            if(map.get(key) > max) {
            	max = map.get(key);
            	ans2 = key;
            }else if(map.get(key) == max){
            	if(key < ans2) ans2 = key;
            	else continue;
            }
            else continue;
        }
		ans1 = sum/10;
		System.out.println(ans1);
		System.out.println(ans2);

		
	}
}
