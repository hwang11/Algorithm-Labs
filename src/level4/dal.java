package level4;

public class dal {
	public static void main(String args[]) {
		//Scanner sc = new Scanner(System.in);
		int a[][] = new int[5][5];
		int i=0,j=-1,k=0,sw=1,p=5;
		
		while(true) {
			for(int l = 0; l <p; l++) {
				k = k + 1;
				j = j + sw;
				a[i][j] = k;
			}
			p = p -1;
			if(p <= 0) break;
			for(int m = 0; m<p;m++) {
				k = k+1;
				i = i+sw;
				a[i][j] = k;
			}
			sw *=-1;
		}
		
		for(int o=0;o<5;o++) {
			for(int y=0;y<5;y++) {
				System.out.print(a[o][y]+" ");
			}
			System.out.println();
		}
		
	}
}
