package circularLinkedList;

import java.util.Scanner;

public class First {
	
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
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		int n;
		do {
			System.out.println("Data: ");
			int data = sc.nextInt();
			Node new_node = new Node(data);
			if(head == null) {
				head = new_node;
				tail = new_node;
				new_node.next = head;
			}else {
				new_node.next = head;
				head = new_node;
				tail.next = head;
			}
			System.out.println("Hit 1 for new Node");
			n = sc.nextInt();
		}while(n==1);
		sc.close();
	}
	
	// for output
	
	public void output() {
		Node temp = head;
		if(head == null) {
			System.out.println("ll not exit");
		}else {
			do {
				System.out.println(temp.data+"  ");
				temp = temp.next;
			}while(temp!=head);
		}
	}
	
	public static void main(String[] args) {
		First f = new First();
		f.input();
		f.output();
	}
}
