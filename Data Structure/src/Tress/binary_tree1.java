package Tress;


//********please note that there is same name of two class in same packgae so this error is giving
//********so if you want to remove it down use diffrent node class in same package



import java.util.Scanner;
public class binary_tree1 {
	static Scanner sc = null;
	
	static Node createTree() {
		Node root=null;
		
		System.out.println("Enter data");
		int data = sc.nextInt();
		if(data==-1) {
			return null;
		}
		
		root = new Node(data);
		
		System.out.println("Enter left data for:"+data);
		root.left = createTree();
		System.out.println("Enter right data for:"+data);
		root.right = createTree();
		
	
	return root;
	}
	
	static void inOrder(Node root) {
		if(root == null) {
			return;
		}
		inOrder(root.left);
		System.out.println(root.data);
		inOrder(root.right);
	}
	
	static void preOrder(Node root) {
		if(root==null) {
			return;
		}
		System.out.println(root.data);
		preOrder(root.left);
		preOrder(root.right);
	}
	
	static void postOrder(Node root) {
		if(root==null) {
			return ;
		}
		postOrder(root.left);
		postOrder(root.right);
		System.out.println(root.data);
	}
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		Node root = createTree();
//		System.out.println("inOrder:");
//		inOrder(root);
		System.out.println("postOrder:");
		postOrder(root);
		System.out.println("preOrder:");
//		preOrder(root);
	}
}

class Node{		// this is error showing that in same package there is same name of two class
	int data;
	Node left;
	Node right;
	
	Node(int data){
		this.data = data;
		this.left = null;
		this.right = null;
	}
}
