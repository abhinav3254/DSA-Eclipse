package SinglyLinkedList;

import java.util.Scanner;

public class fourth {
	static class Node {
		int data;
		Node next;

		public Node(int data) {
			// TODO Auto-generated constructor stub
			this.data = data;
			this.next = null;
		}
	}
	
	Node head = null;
	
	private void insert() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n ;
		do {
			System.out.println("Data:");
			int data = sc.nextInt();
			Node new_node = new Node(data);
			if(head==null) {
				head = new_node;
			}
			else {
				new_node.next = head;
				head = new_node;
			}
			System.out.println("Hit 1 for new node");
			n = sc.nextInt();
		}while(n==1);
		sc.close();

	}
	
	private void pop() {
		// TODO Auto-generated method stub
		Node temp = head;
		if(head==null) {
			System.out.println("LL not exist");
		}
		else {
			while(temp!=null) {
				System.out.println(temp.data+" ");
				temp = temp.next;
			}
		}
	}
	
	public static void main(String[] args) {
		fourth f = new fourth();
		f.insert();
		f.pop();
	}
}
