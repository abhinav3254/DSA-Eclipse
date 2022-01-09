package SinglyLinkedList;

import java.util.Scanner;

public class middle {

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
	Node head1 = null;

	void CreateLinkedList() {

		Scanner sc = new Scanner(System.in);

		int n;

		do {

			System.out.println("Data");
			int data = sc.nextInt();
			Node new_node = new Node(data);

			if (head == null) {
				head = new_node;
				head1 = new_node;
			} else {
				new_node.next = head;
				head = new_node;
				new_node.next = head1;
				head1 = new_node;
			}
			System.out.println("Hit 1 for new Node");
			n = sc.nextInt();
		} while (n == 1);
		sc.close();
	}

	int count = 0;

	void print() {
		if (head == null) {
			System.out.println("Not exit");
		} else {
			while (head != null) {
				System.out.println(head.data);
				head = head.next;
				count = count + 1;
			}
		}
	}

	public static void main(String[] args) {
		middle m = new middle();
		m.CreateLinkedList();
		m.print();
		
		System.out.println("count value is :-");
		System.out.println(m.count);
		
		System.out.println();
		System.out.println("Middle element is :- ");
		m.valueMiddle();
	}
//	Node head1 = head;
	void valueMiddle() {
		int middle = 0;
		if(count%2!=0) {
			middle = (count-1)/2;
		}else {
			middle = count/2;
		}
		while(true) {
			for(int i=0;i<middle;i++) {
				head1 = head1.next;
			}
			System.out.println(head1.data);
			break;
		}
	}
}
