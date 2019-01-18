package level3;

import java.util.ArrayList;
import java.util.Scanner;

public class Offset {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String a[][] = new String[5][5];
		int d[][] = {{0,1},{1,0},{0,-1},{-1,0}};
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				a[i][j] = sc.next();
			}
		}
		
		ArrayList<Dot> li = new ArrayList<Dot>();
		int p = 4;
		int cnt = 0;
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				cnt = 0;
				p = 4;
				for(int k=0;k<4;k++) {
					int nx = (i+d[k][0]);
					int ny = (j+d[k][1]);
					if(nx < 0 || nx >= 5 || ny < 0 || ny >= 5) {
						p--;
					}
					else {
						if(Integer.parseInt(a[i][j]) < Integer.parseInt(a[nx][ny])) {
							cnt++;
						}
					}
					if(p == cnt) {
						li.add(new Dot(i,j));
					}
				}
			}
		}
		
		for(int i=0;i<li.size();i++) {
			Dot dot = li.get(i);
			a[dot.x][dot.y] = "*";
		}
		System.out.println();
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static class Dot{
		int x;
		int y;
		public Dot(int x,int y) {
			this.x =x;
			this.y = y;
		}
	}
}
