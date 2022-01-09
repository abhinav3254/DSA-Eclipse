package Tress;



//********please note that there is same name of two class in same packgae so this error is giving
//********so if you want to remove it down use diffrent node class in same package




import java.util.*;
public class Binary_tree2 {
	static Scanner sc = null;
	static Node createTree() {
		Node root = null;
		System.out.println("DATA:");
		int data = sc.nextInt();
		if(data==-1) {
			return null;
		}
		
		root = new Node(data);
		System.out.println("Enter left for"+data);
		root.left = createTree();
		System.out.println("Enter right for "+data);
		root.right = createTree();
		
		
		return root;
	}
	
	static void printData(Node root) {
		if(root==null)
			return ;
		printData(root.left);
		System.out.println(root.data);
		printData(root.right);
	}
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		Node root = createTree();
		printData(root);
	}
}

class Node{
	int data;
	Node left;
	Node right;
	Node(int data){
		this.data = data;
		this.left = this.right = null;
	}
}
