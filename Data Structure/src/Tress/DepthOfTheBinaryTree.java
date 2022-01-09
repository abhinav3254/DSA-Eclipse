package Tress;
import java.util.Scanner;
public class DepthOfTheBinaryTree {

	
	static class Node{
		int data;
		Node left,right;
		public Node(int data) {
			// TODO Auto-generated constructor stub
			this.data = data;
			this.left = this.right = null;
		}
	}
	static Scanner sc = new Scanner(System.in);
	static Node addElement() {
		System.out.println("Enter data");
		Node new_node;
		int data = sc.nextInt();
		if(data == -1) {
			return null;
		}else {
			
			new_node = new Node(data);
			System.out.println("Enter left of "+data);
			new_node.left = addElement();
			
			System.out.println("Enter right of "+data);
			new_node.right = addElement();
			return new_node;
		}
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
	
	static int calDepth(Node root) {
		if(root==null) {
			return 0;
		}
		
		int ldepth = calDepth(root.left);
		int rdepth = calDepth(root.right);
		
		
		if(ldepth>rdepth) {return ldepth+1;}
		else {return rdepth+1;}
	}
	
	
	
	
	
	public static void main(String[] args) {
		Node node = addElement();
		inOrder(node);
		
		System.out.println();
		System.out.print("Calculating the depth of the tree.");
		try {
			
			for(int i=0;i<3;i++) {
				Thread.sleep(2000);
				System.out.print(".");
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		
		System.out.println();
		System.out.println(calDepth(node));
	}
}
