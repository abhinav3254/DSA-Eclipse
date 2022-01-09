package SinglyLinkedList;

import java.util.Scanner;

public class w3_resource1 {
	
	static class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	Node head = null;
	
	public void push() {
		Scanner sc = new Scanner(System.in);
		int n;
		do {
			System.out.print("DATA: ");
			int data = sc.nextInt();
			Node new_node = new Node(data);
			
			if(head == null) {
				head = new_node;
			}
			
			else {
				
				new_node.next = head;
				head = new_node;
			}
			System.out.println("Hit 1 for new Node");
			n = sc.nextInt();
		}while(n==1);
		sc.close();
	}
	
	public void pop() {
		
		
		if(head == null) {
			System.out.println("Linked List Empty");
		
		}
		
		else {
			
			
			while(head!=null) {
				System.out.print(head.data+"    ");
				head = head.next;
			}
		}
	}

	public static void main(String[] args) {
		
		
		w3_resource1 w = new w3_resource1();
		w.push();
		w.pop();
	}
}
