package level3;

import java.util.Scanner;

public class classpresident {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[][] = new int[n][5];
		for(int i=0;i<n;i++) {
			for(int j=0;j<5;j++) {
				a[i][j] = sc.nextInt();
			}
		}
		int k;
		int p[][] = new int[n][n];
		// 그 학생과 반장 후보 학생이 한 번이라도 같은 반이었
		//던 학년이 있었는지를 검사하는 것이다.
		for(int m=0;m<n;m++) {
			for(int j=0;j<5;j++) {
				k = a[m][j];
				for(int i=0;i<n;i++) {
					if(m == i) continue;
					if(k == a[i][j]) p[m][i]++;
				}
			}
		}
		int b[] = new int[n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(p[i][j] > 0) {
					b[i]++;
				}
			}
		}
		int max = 0;
		int ans = 0;
		for(int i=0;i<n;i++) {
			if(max < b[i]) {
				max = b[i];
				ans = i;
			}
			else if(max == b[i]) {
				if(ans>i) ans = i;
			}
		}
		System.out.println((ans+1));
	}
	
}
