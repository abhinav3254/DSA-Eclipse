package Array;

public class spiral_traverse_of_matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] arr = {{1,2,3,4,5,6},{7,8,9,10,11,12},{13,14,15,16,17,18},{19,20,21,22,23,24},{25,26,27,28,29,30}};
		/*
		0   1   2   3   4   5
		
	0	1   2   3   4   5   6
	
	1	7   8   9   10  11 12
	
	2	13  14  15  16  17 18
		*/
		int row = 5;
		int column = 6;
		spiralMove(row, column, arr);
	}
	
	static void spiralMove(int m,int n,int[][] a) {
		
		
		int i=0;
		int k=0,l=0;		// k--> starting row and l--> starting column
		while(k<m&&l<n) {
			
			// printing first row
			for(i=0;i<n;i++) {
				System.out.print(a[k][i]+" ");
			}
			k++;
			// printing last column
			for(i=k;i<m;i++) {
				System.out.print(a[i][n-1]+" ");
			}
			n--;
			// printing last row
			if(k<m) {
				for(i=n-1;i>=l;i--) {
					System.out.print(a[m-1][i]+" ");
				}
				m--;
			}
			
			// printing first column
			if(l<n) {
				for(i=m;i>k;i--) {
					System.out.print(a[i][l]+" ");
				}
				l++;
			}
		}
	}

}
