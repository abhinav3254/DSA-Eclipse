package SinglyLinkedList;

import java.util.Scanner;

public class count_nodes {
	static int count_node = 0;
	static Node head = null;
	static Scanner sc = new Scanner(System.in);
	static void createNode(){
		int n;
		do {
			System.out.print("DATA:");
			int data = sc.nextInt();
			Node new_node = new Node(data);
			if(head == null) {
				head = new_node;
			}else {
				new_node.next = head;
				head = new_node;
			}
			
			System.out.println("Hit 1 for new Node");
			n = sc.nextInt();
		}while(n==1);
		
		
	}
	
	static void pop() {
		if(head == null) {
			return;
		}
		else {
			while(head!=null) {
				System.out.println(head.data);
				head = head.next;
			}
		}
	}
	
	static void count() {
		if(head==null) {
			return;
		}
		else {
			while(head!=null) {
				head = head.next;
				count_node = count_node+1;
			}
		}
		System.out.println("Total Nodes = "+count_node);
	}
	
	public static void main(String[] args) {
		createNode();
//		pop();
//		System.out.println(count_node);
		if(count_node%2!=0) {
			System.out.println("Odd");
		}
		else {
			System.out.println("Even");
		}
		count();
		count();
	}
}

class Node{
	int data;
	Node next;
	public Node(int data) {
		// TODO Auto-generated constructor stub
		this.data = data;
		this.next = null;
	}
}
