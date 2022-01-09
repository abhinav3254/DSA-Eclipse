package SinglyLinkedList;

import java.util.Scanner;

public class third {
	
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
			System.out.print("Data: ");
			int data = sc.nextInt();
			Node new_node = new Node(data);
			if(head == null) {
				head = new_node;
			}
			else {
				System.out.println();
				System.out.println("------menu--------");
				System.out.println("Hit 1 for first place");
				System.out.println("Hit 2 for last place");
				System.out.println("Hit 3 for specific position");
				int m = sc.nextInt();
				switch(m) {
				case 1: 
					new_node.next = head;
					head = new_node;
					break;
					
				case 2:
					Node temp = head;
					while(temp.next!=null) {
						temp = temp.next;
					}
					temp.next = new_node;
					break;
					
				case 3:
					Node temp1 = head;
					System.out.println("Enter postion");
					int p = sc.nextInt();
					for(int i=1;i<p-1;i++) {
						temp1 = temp1.next;
					}
					new_node.next = temp1.next;
					temp1.next = new_node;
				}
			}
			System.out.println("hit 1 for new node");
			n = sc.nextInt();
//			sc.close();
		}while(n==1);
		sc.close();
	}
	
	public void printData() {
		Node temp = head;
		if(temp==null) {System.out.println("Linked List doesn't exit");}else {
			while(temp!=null) {
				System.out.println(temp.data+"\t");
				temp = temp.next;
			}
		}
	}
	
	public static void main(String[] args) {
		third t = new third();
		t.insert();
		t.printData();
	}
}
