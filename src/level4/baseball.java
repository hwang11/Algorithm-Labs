package level4;

import java.util.Scanner;

public class baseball {
	static int map[][];
	static int maxy,maxx;
	public static void fill(int x1, int y1, int x2, int y2) {
	 maxy = Math.max(maxy, y2);
	 maxx = Math.max(maxx, x2);
		for (int i = y1; i <y2; i++) {
			for (int j = x1; j <x2; j++) {
				map[i][j] = 1;
			}
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		map = new int[101][101];
		maxy = maxx = 0;

		for (int i = 0; i < 4; i++) {
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			fill(x1, y1, x2, y2);
		}
		int cnt = 0;
		for(int i=0;i<=maxy;i++) {
			for(int j=0;j<=maxx;j++) {
				System.out.print(map[i][j]+" ");
			}
			System.out.println();
		}
		for(int i=0;i<=maxy;i++) {
			for(int j=0;j<=maxx;j++) {
				if(map[i][j] == 1) cnt++;
			}
		}
		System.out.println(cnt);
	}
}
