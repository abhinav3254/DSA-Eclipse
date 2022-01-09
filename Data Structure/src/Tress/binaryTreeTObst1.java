package Tress;

import java.util.Scanner;

public class binaryTreeTObst1 {
	
	static int[] arr = new int[20];
	static int i=0;
	static Scanner sc = new Scanner(System.in);
	static Node createTree() {
		Node root = null;
		System.out.println("Enter data");
		int data = sc.nextInt();
		if(data == -1) {
			return null;
		}
		else {
			root = new Node(data);
			System.out.println("Enter left of "+data);
			root.left = createTree();
			System.out.println("Enter right of "+data);
			root.right = createTree();
		}
		return root;
	}
	
	static void inOrder(Node root) {
		if(root==null) {
			return ;
		}
		else {
			inOrder(root.left);
			System.out.println(root.data);
			inOrder(root.right);
		}
	}
	
	static void convertArray(Node root) {
		if(root==null) {
			return ;
		}
		else {
			inOrder(root.left);
			arr[i] = root.data;
			inOrder(root.right);
		}
	}
	public static void main(String[] args) {
		Node root = createTree();
		inOrder(root);
		convertArray(root);
		for(int i:arr)
		System.out.println(i);
	}
	
}

class Node{
	int data;
	Node left;
	Node right;
	public Node(int data) {
		// TODO Auto-generated constructor stub
		this.data = data;
		this.left = null;
		this.right = null;
	}
}

