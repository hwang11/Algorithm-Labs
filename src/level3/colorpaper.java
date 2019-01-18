package level3;

import java.util.ArrayList;
import java.util.Scanner;

public class colorpaper {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int a[][] = new int[n][m];
		int x = sc.nextInt() -1;
		int y = sc.nextInt() -1;
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				a[i][j] = sc.nextInt();
			}
		}
		
		int dis[][] = {{1,0},{0,1},{-1,0},{0,-1},{-1,-1},{-1,1},{1,-1},{1,1}};
		int cnt = 0;
		if(a[x][y] == 1) System.out.println("game over");
		else {
			for(int i=0;i<8;i++) {
				int mx = x + dis[i][0];
				int my = y + dis[i][1];
				if(mx < 0 || my < 0 || mx >= n || my >= m) continue;
				if(a[mx][my] == 1) cnt++;
			}
			System.out.println(cnt);
		}
	}
}
