package Graphs;
import java.util.*;
import java.io.*;
public class GraphOne {
	
	// this method will print the data
	static void addEdge(ArrayList<ArrayList<Integer>> adj,int u , int v) {
		adj.get(u).add(v);
		adj.get(v).add(u);
	}
	
	// This method will print the data of the Graph
	static void printGraph(ArrayList<ArrayList<Integer>> adj) {
		for(int i=0;i<adj.size();i++) {
			System.out.println("Adjacnecy List of vertex "+i);
			System.out.print("head");
			for(int j=0;j<adj.get(i).size();j++) {
				System.out.print("-->"+adj.get(i).get(j));
			}
			System.out.println();
		}
	}

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the vertices");
		int v = Integer.parseInt(br.readLine());
		ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(v);
		for(int i=0;i<v;i++) 
			adj.add(new ArrayList<Integer>());
		addEdge(adj, 0, 1);
        addEdge(adj, 0, 4);
        addEdge(adj, 1, 2);
        addEdge(adj, 1, 3);
        addEdge(adj, 1, 4);
        addEdge(adj, 2, 3);
        addEdge(adj, 3, 4);
          
        printGraph(adj);
		
	}

}
