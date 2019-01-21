package level4;

import java.util.Scanner;

public class bingo {
	static int map[][], a[];
	static int cnt, row, col, x, x1;

	public static boolean check(int k) {
		for (int i = 0; i < 5; i++) { // 가로 검사
			row = 0;
			col = 0;
			for (int j = 0; j < 5; j++) {
				if (map[i][j] == 0) {
					row++;
				}
				if (map[j][i] == 0) {
					col++;
				}
			}
			if (row == 5) {
				cnt++;
			}
			if (col == 5) {
				cnt++;
			}
		}

		x1 = 0;
		for (int i = 0; i < 5; i++) {
			if (map[i][i] == 0) {
				x1++;

			}
			if (x1 == 5) {
				cnt++;

			}
		}

		x = 0;
		for (int i = 0; i < 5; i++) {
			for (int j = 5 - i - 1; j == 5 - i - 1; j--) {
				if (j < 0)
					break;
				if (map[i][j] == 0) {
					x++;
				}
			}
			if (x == 5) {
				cnt++;
			}
		}

		if (cnt >= 3)
			return true; // 빙고가 3줄이상이 바로되는 경우도 고려해야하므로!
		else
			return false;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		map = new int[5][5];
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				map[i][j] = sc.nextInt();
			}
		}
		a = new int[25];
		cnt = 0;
		for (int i = 0; i < 25; i++) {
			a[i] = sc.nextInt();
		}
		boolean flag = false;
		for (int k = 0; k < 25; k++) {
			if (flag)
				break;
			for (int i = 0; i < 5; i++) {
				for (int j = 0; j < 5; j++) {
					if (map[i][j] == a[k]) {
						map[i][j] = 0;
						cnt = 0;
						if (check(k)) {
							System.out.println((k + 1));
							flag = true;
						}
					}
				}
			}
		}

	}
}
