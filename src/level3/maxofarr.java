package level3;

import java.util.ArrayList;
import java.util.Scanner;

public class maxofarr {
	public static void main(String args[]) {
//		Scanner sc = new Scanner(System.in);
//		int a[][] = new int[9][9];
//		for(int i=0;i<9;i++) {
//			for(int j=0;j<9;j++) {
//				a[i][j] = sc.nextInt();
//			}
//		}
//		int max = 0;
//		int r,c;
//		r = c = 0;
//		for(int i=0;i<9;i++) {
//			for(int j=0;j<9;j++) {
//				max = Math.max(max, a[i][j]);
//			}
//		}
//		ArrayList<Dot> li = new ArrayList<Dot>();
//		for(int i=0;i<9;i++) {
//			for(int j=0;j<9;j++) {
//				if(max == a[i][j]) {
//					li.add(new Dot(i,j));
//				}
//			}
//		}
//		for(int i=0;i<li.size();i++) {
//			Dot dot = li.get(i);
//			
//		}
//		
//		System.out.println(max);
		
		Scanner sc = new Scanner(System.in);
		int a[][] = new int[9][9];
		for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++) {
				a[i][j] = sc.nextInt();
			}
		}
		int max = 0;
		int r,c;
		r = c = 0;
		for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++) {
				if(max <= a[i][j]) {
					if(a[i][j] == max) {
						if(r>i) {
							r = i;
							c = j;
						}
						else if(r==i){
							if(c>j) {
								c = j;
							}
							else {
								continue;
							}
						}
						else {
							continue;
						}
					}
					max = a[i][j];
					r = i;
					c = j;
				}
			}
		}
		System.out.println(max);
		System.out.print((r+1)+" "+(c+1));
		
	}
	public static class Dot{
		int x;
		int y;
		public Dot(int x,int y) {
			this.x = x;
			this.y = y;
		}
	}
}
