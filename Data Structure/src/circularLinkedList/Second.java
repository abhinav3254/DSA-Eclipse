package circularLinkedList;

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
	Node tail = null;
	Scanner sc = new Scanner(System.in);
	public void input() {
		int n;
		do {
		System.out.println("Data: ");
		int data = sc.nextInt();
		Node new_node = new Node(data);
		if(head==null) {
			head = new_node;
			tail = new_node;
			new_node.next = head;
		}else {
			new_node.next = head;
			head = new_node;
			tail.next = head;
		}
		System.out.println("Hit 1 to add new node");
		n = sc.nextInt();
		}while(n==1);
	}
	
	public void del() {
		Node temp = head;
		Node temp2 = head;
		Node ptr = temp2.next;
		System.out.println("Enter the postion to del");
		int m = sc.nextInt();
		switch(m) {
		case 1:
			head = temp.next;
			tail.next = head;
			break;
		case 2:
			while(ptr.next!=head) {
				temp2 = ptr;
				ptr = ptr.next;
			}
			temp2.next = head;
			tail = temp2;
		}
	}
	
	public void output() {
		Node temp = head;
		if(temp == null) {System.out.println("LL not exit");}
		else {
			do {
				System.out.println(temp.data+" ");
				temp = temp.next;
			}while(temp!=head);
		}
	}
	
	public static void main(String[] args) {
		Second s = new Second();
		s.input();
		s.del();
		s.output();
	}
}
