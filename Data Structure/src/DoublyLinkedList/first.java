package DoublyLinkedList;

import java.util.Scanner;

public class first {
	
	static class Node{
		int data;
		Node prev;
		Node next;
		
		public Node(int data) {
			this.data = data;
			this.next = null;
			this.prev = null;
		}
	}
	
	Node head = null;
	Node tail = null;
	
	public void insert() {
		int n;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("DATA: ");
			int data = sc.nextInt();
			Node new_node = new Node(data);
			if(head == null) {
				head = new_node;
//				new_node.prev = head;
				tail = new_node;
//				new_node.next = tail;
			}else {
				new_node.next = head;
				head.prev = new_node;
				head = new_node;
			}
			System.out.println("hit 1 for new node");
			n = sc.nextInt();
		}while(n==1);
		sc.close();
	}
	
	public void pop() {
		Node temp = head;
		if(temp == null) {
			System.out.println("LL Empty");
		}else {
			while(temp!=null) {
				System.out.println(temp.data+"  ");
				temp = temp.next;
			}
		}
	}
	
	public static void main(String[] args) {
		first f = new first();
		f.insert();
		f.pop();
	}
}
