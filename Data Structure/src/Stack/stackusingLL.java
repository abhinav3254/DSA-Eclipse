package Stack;

import java.util.Scanner;

public class stackusingLL {
	Scanner sc = new Scanner(System.in);
	static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	Node head = null;
	
	public void push() {
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
	}
	
	public void pop() {
		if(head==null) {
			System.out.println("Stack UnderFlow");
		}
		else {
			System.out.println(head.data);
			head = head.next;
		}
	}
	
	public static void main(String[] args) {
		stackusingLL sll = new stackusingLL();
		sll.push();
		int n;
		Scanner sc = new Scanner(System.in);
		do {
			sll.pop();
			System.out.println("1 for print again");
			n = sc.nextInt();
		}while(n==1);
		sc.close();
	}

}
