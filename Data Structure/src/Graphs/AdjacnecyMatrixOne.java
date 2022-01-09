package Graphs;
import java.io.*;

public class AdjacnecyMatrixOne {
    public static void main(String[] args) throws IOException {
        // making class of Buffered Reader
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        System.out.println("Number of nodes");
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];   // for values
        int[][] arr = new int[n][n];    // matrix
        System.out.print("Enter the nodes: ");
        for(int i = 0;i<n;i++){
            a[i] = Integer.parseInt(br.readLine());
        }

        // here adjacency matrix
        System.out.println("Hit 1 for relational and Hit 0 for no relation");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(a[i]+" has connection with "+a[j]);
                arr[i][j] = Integer.parseInt(br.readLine());
            }
        }
        adjacencyMatrixDef(arr,n);
    }

    static void adjacencyMatrixDef(int[][] arr,int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

}
