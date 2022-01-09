package SinglyLinkedList;

import java.util.Scanner;

public class firstsinglylinkedlist {
	
	static class Node{		// static inner class
		
		int data;
		Node next;		// class type variable
		
		Node(int data){				// constructor of Node(static class)
			
			this.data = data;
			this.next = null;
		}
	}
	
	Node head = null;
	
	public void insert() {			// method for insertion
		int n;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Data : ");
			int data = sc.nextInt();
			Node new_node = new Node(data);
			
			if(head == null) {
				head = new_node;
			}else {
				new_node.next = head;
				head = new_node;
			}
			System.out.println("Hit 1 for New Node");
			n = sc.nextInt();
		}while(n==1);
		sc.close();
	}
	
	public void pop() {		// method for output
//		Node head = head;
		if(head == null) {
			System.out.println("Linked List Empty");
		}else {
			while(head!=null) {
//				Node head = head;
				System.out.println(head.data+" ");
				head = head.next;
			}
		}
	}
	
	public static void main(String[] args) {
		firstsinglylinkedlist fsll = new firstsinglylinkedlist();
		fsll.insert();
		fsll.pop();
	}

}
