package Tress;

public class bst2 {
	
	static Node root;
	
	static Node createNode(Node root,int data) {
		if(root == null) {
			root = new Node(data);
		}
		
		if(root.data>data) {
			root.left = createNode(root.left, data);
		}
		
		if(root.data < data) {
			root.right = createNode(root.right, data);
		}
		
		return root;
	}
	
	static void create(int data) {
		root = createNode(root, data);
	}
	
	static void inOrder(Node root) {
		if(root!=null) {
			inOrder(root.left);
			System.out.println(root.data);
			inOrder(root.right);
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {50,40,80,35,45,70,90};
		for(int i:arr) {
			create(i);
		}
		
		inOrder(root);
	}
}
class Node{
	int data;
	Node left;
	Node right;
	public Node(int data) {
		// TODO Auto-generated constructor stub
		this.data = data;
		this.left = left;
		this.right = right;
	}
}
