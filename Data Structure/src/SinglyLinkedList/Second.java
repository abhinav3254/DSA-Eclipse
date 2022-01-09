package SinglyLinkedList;

import java.util.Scanner;

public class Second {
	
	static class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	Node head = null;
	
	public void insert() {
		int n;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("Data : ");
			int data = sc.nextInt();
			Node new_node = new Node(data);
			System.out.println();
			if(head == null) {
				head = new_node;
			}
			else {
				System.out.println("-----menu--------");
				System.out.println("Hit 1 for insert at starting");
				System.out.println("Hit 2 for insertion at end");
				System.out.println("Hit 3 for insertion at specific location");
				int choice = sc.nextInt();
				
				switch(choice) {
				case 1: 
					new_node.next = head;
					head = new_node;
					break;
				case 2:
					while(head.next != null) {
						head = head.next;
					}
					head.next = new_node;
					break;
					
					// deletion from a specific loaction
				case 3:
					System.out.println("Hit the position");
					int p = sc.nextInt();
					for(int i=1;i<p-1;i++) {
						head = head.next;
					}
					new_node.next = head.next;
					head = new_node;
				}
			}
//			System.out.println();
			System.out.println("Hit 1 for new node insertion ");
			n = sc.nextInt();
//			sc.close();
		}while(n==1);
		sc.close();
	}
	
	public void print() {
		if(head == null) {
			System.out.println("Linked list doesn't exit");
		}
		else {
			while(head != null) {
				System.out.println(head.data+"  ");
				head = head.next;
			}
		}
	}
	
	public static void main(String[] args) {
		Second s = new Second();
		s.insert();
		s.print();
	}

}
