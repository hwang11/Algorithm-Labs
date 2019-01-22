package level3;

import java.util.ArrayList;
import java.util.Scanner;

public class rook {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int map[][] = new int[8][8];
		int x = 0, y = 0;
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				map[i][j] = sc.nextInt();
				if (map[i][j] == 1) {
					x = j;
					y = i;
				}
			}
		}
		boolean flag = true;
		int d[][] = {{1,0},{0,1},{-1,0},{0,-1}};
		boolean v[] = new boolean[4];
		for(int i=1;i<8;i++) {
			for(int j=0;j<4;j++) {
				if(v[j]) continue;
				int ny = y + d[j][0]*i;
				int nx = x + d[j][1]*i;
				if(nx < 0 || ny < 0 || nx >= 8 || ny >= 8) continue;
				if(map[ny][nx] == 3) {
					v[j] = true;
				}
				if(map[ny][nx] == 2) {
					flag = false;
					break;
				}
			}
			if(!flag) break;
		}
		
		if(flag) System.out.println(0);
		else System.out.println(1);
	}
}
