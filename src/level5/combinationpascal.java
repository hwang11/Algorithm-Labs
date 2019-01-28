package level5;

import java.util.Scanner;

public class combinationpascal {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int map[][] = new int[n+1][n+1];
		map[0][0] = 1;
		for(int i=1;i<=n;i++) {
			for(int j=0;j<=n;j++) {
				if(j == 0) {
					map[i][j] = 1;
				}
				else if(j == i) {
					map[i][j] = 1;
				}
				else {
					map[i][j] = map[i-1][j-1] + map[i-1][j];
				}
			}
		}
		System.out.println(map[n][m]);
 		if(map[n][m]%10000 == 0) System.out.println("oo");
 		else System.out.println("no");
	}
}
