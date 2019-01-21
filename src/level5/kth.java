package level5;

import java.util.Arrays;
import java.util.Scanner;

public class kth {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[10];
		int k = sc.nextInt();
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		
//		int temp = 0;
//		for(int i=0;i<n-1;i++) {
//			for(int j=i+1;j<n;j++) {
//				if(a[i] > a[j]) {
//					temp = a[i];
//					a[i] = a[j];
//					a[j] = temp;
//				}
//			}
//		}
		Arrays.sort(a);
		System.out.println(a[n-k]);
	}
}
