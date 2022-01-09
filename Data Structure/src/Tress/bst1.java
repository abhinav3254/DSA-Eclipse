package Tress;

public class bst1 {
	
	Node root;
	
	public void addElement(int data) {
		Node new_node = new Node(data);
		if(root == null) {
			root = new_node;
		}
		else {
			Node focusNode = root;
			Node parent;
			while(true) {
				parent = focusNode;
				if(data<focusNode.data) {
					focusNode = focusNode.left;
					if(focusNode == null) {
						parent.left = new_node;
						return ;
					}
				}
				else {
					focusNode = focusNode.right;
					if(focusNode == null) {
						parent.right = new_node;
						return ;
					}
				}
			}
		}
	}
	
	public void inOrder(Node focusNode) {
		if(focusNode!=null) {
			inOrder(focusNode.left);
			System.out.println(focusNode.data);
			inOrder(focusNode.right);
		}
	}
	
	public static void main(String[] args) {
		bst1 b = new bst1();
		b.addElement(30);
		b.addElement(25);
		b.addElement(52);
		b.addElement(5);
		b.addElement(26);
		b.addElement(48);
		b.addElement(60);
		b.inOrder(b.root);
		
	}
	
}

class Node{
	int data;
	Node left;
	Node right;
	
	public Node(int data) {
		// TODO Auto-generated constructor stub
		this.data = data;
	}
}
