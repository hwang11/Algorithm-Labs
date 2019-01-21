package level4;

import java.util.Scanner;
//미완 90점.
public class tetris {
	static int c, r, cnt, num,cnt2,cnt3;
	static int map[][], map2[][];
	static boolean flag;

	public static int check() { //몇 줄의 수평선 메우는지 
		num = cnt = 0;
		for (int i = r - 1; i >= 0; i--) {
			num = 0;
			for (int j = 0; j < c; j++) {
				if (map[i][j] == 1)
					num++;
			}
			if (num == c)
				cnt++;
		}
		if (cnt > 0)
			return cnt;
		else
			return 0;
	}
	public static void fill(int x) {
		cnt3 = 0;
		int max2 = -1;
		for(int i=0;i<r;i++) {
			if(map[i][x] == 0) {
				if(max2 < i) {
					max2 = i;
				}
				cnt3++;
			}
			else break;			
		}
		if(cnt3 <= 3) {
			cnt2++;
		}
		for(int j=max2;j>=max2-3;j--) {
			if(j<0) return;
			map[j][x] = 1;
		}

	}
	public static void init() {
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				map[i][j] = map2[i][j];
			}
		}
	}
	public static void print() {
		System.out.println();
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.out.print(map[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		c = sc.nextInt(); // 가로.
		r = sc.nextInt(); // 세로.
		map = new int[r][c];
		map2 = new int[r][c];

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				map[i][j] = map2[i][j] = sc.nextInt();
			}
		}
		flag = true;
		int max = 0;
		int b, ans;
		b = ans = cnt2 = 0;
		for (int i = 0; i < c; i++) {
			if(map[0][i] == 1) {
				flag = false;
				break;
			}
			fill(i);
			b = check();
			if (max < b) {
				ans = i;
				max = b;
			}
			
			print();
			init();
		}
		System.out.println(cnt2);
		if (max == 0 || !flag || cnt2 >= c)
			System.out.println(0 + " " + 0);
		else
			System.out.println((ans + 1) + " " + max);
	}
}
