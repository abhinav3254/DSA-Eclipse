package Graphs;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class first {
	
	private LinkedList<Integer> adj[];
	public first(int v) {
		// TODO Auto-generated constructor stub
		adj = new LinkedList[v];
		for(int i=0;i<v;i++) {
			adj[i] = new LinkedList<>();
		}
	}
	
	public void addEdge(int source,int destination) {
		adj[source].add(destination);
		adj[destination].add(source);
	}
	
	public int bfs(int source,int destination) {
		boolean vis[] = new boolean[adj.length];
		int parent[] = new int[adj.length];
		Queue<Integer> q = new LinkedList<>();
		
		q.add(source);
		parent[source] = -1;
		vis[source] = true;
		
		while(!q.isEmpty()) {
			int cur = q.poll();
			if(cur==destination) break;
			
			for(int neighbor:adj[cur]) {
				if(!vis[neighbor]) {
					vis[neighbor] = true;
					q.add(neighbor);
					parent[neighbor] = cur;
				}
			}
		}
		
		int cur = destination;
		int distance = 0;
		while(parent[cur]!=-1) {
			System.out.print(cur+" --> ");
			cur = parent[cur];
			distance++;
		}
		return distance;
	}
	
	public static void main(String[] args) throws IOException{
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		System.out.println("Enter number of vertex");
		int v = Integer.parseInt(br.readLine());
		first graph = new first(v);
		System.out.println("Enter number of edges");
		int e = Integer.parseInt(br.readLine());
		System.out.println("Enter "+e+" edges");
		for(int i=0;i<e;i++) {
			int source = Integer.parseInt(br.readLine());
			int d = Integer.parseInt(br.readLine());
			graph.addEdge(source, d);
//			graph.bfs(source, d);
		}
		graph.bfs(0,4);
	}
}
