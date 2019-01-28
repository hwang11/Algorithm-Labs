package level4;

import java.util.Arrays;
import java.util.Scanner;

public class baseball {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt = 0;
		boolean v[] = new boolean[988];
		for(int j=0;j<n;j++) {
			int num = sc.nextInt();
			int num1[] = new int[3];
			int num2[] = new int[3];
			num1[0] = num/100;
			int m = num%100;
			num1[1] = m/10; //10의자리 
			num1[2] = m%10; //1의자리 
			int s = sc.nextInt();
			int b = sc.nextInt();
			
			for(int i=123;i<=987;i++) {
				int s1 = 0;
				int b1 = 0;
				if(v[i]) continue;
				num2[0] = i/100;//100 의 자리 숫자
				int f = i%100; //필요X 
				num2[1] = f/10; //10의자리
				num2[2] = f%10; //1의자리 
				if(num2[0] ==0 || num2[1] == 0 || num2[2] == 0) {
					v[i] = true;
					continue;
				}
				if(num2[0] == num2[1] || num2[1] == num2[2] || num2[0] == num2[2]) {
					v[i] = true; 
					continue;
				}
				//조건 검사 
				if(num1[0] == num2[0]) s1++;
				if(num1[1] == num2[1]) s1++;
				if(num1[2] == num2[2]) s1++;
				if(num1[0] == num2[1] || num1[0] == num2[2] ) b1++;
				if(num1[1] == num2[0] || num1[1] == num2[2] ) b1++;
				if(num1[2] == num2[1] || num1[2] == num2[0] ) b1++;
				if(s == s1 && b == b1) {
					//if(v[i]) System.out.println("num: "+num+" i: "+i);
					v[i] = false;
				}
				else v[i] = true;
			}
		}
		for(int i=123;i<=987;i++) {
			if(!v[i]) {
				cnt++;
			}
		}
		System.out.println("cnt:"+cnt);
		
		//continue 처리를 해주지 않아서 v[i] = true 로 바뀌었던 값이 밑에서 다시 v[i] = false로 바뀌는 경우가 있어서 90점 나왔던것 
	}
}
