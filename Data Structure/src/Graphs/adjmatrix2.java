package Graphs;

public class adjmatrix2 {
	private int[][] arr;
	private int size;
	public adjmatrix2() {
		// TODO Auto-generated constructor stub
		this.size = 4;
		this.arr = new int[this.size][this.size];
	}
	
	 void addEdge(int i,int j) {
		arr[i][j] = 1;
		arr[j][i] = 1;
	}
	 
	 void print() {
		 for(int i = 0;i<arr[0].length;i++) {
			 for(int j=0;j<arr[0].length;j++) {
				 System.out.print(arr[i][j]+"  ");
			 }
			 System.out.println();
		 }
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		adjmatrix2 g = new adjmatrix2();
		 g.addEdge(0, 1);
		 g.addEdge(0, 2);
		 g.addEdge(1, 2);
		 g.addEdge(2, 0);
		 g.addEdge(2, 3);
		 g.print();
	}

}
