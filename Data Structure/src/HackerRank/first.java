//Sample Input
//
//2
//16
//13
//Sample Output
//
//16
//13

package HackerRank;

import java.util.Scanner;

public class first {
	
	static class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	Node head = null;
	Scanner sc = new Scanner(System.in);
	public void insert() {
		int n;
		do {
		System.out.println("data");
		int data = sc.nextInt();
		Node new_node = new Node(data);
		if(head==null) {
			head = new_node;
		}
		else {
			Node temp = head;
			while(temp.next!=null) {
				temp = temp.next;
			}
			temp.next = new_node;
		}
		System.out.println("1 for new node");
		n = sc.nextInt();
		}while(n==1);
	}
	public void output() {
		Node temp = head.next;
		if(temp == null) {
			
		}
		else {
			while(temp != null) {
				System.out.println(temp.data+" ");
				temp = temp.next;
			}
		}
	}
	public static void main(String[] args) {
		first f = new first();
		f.insert();
		f.output();
	}

}
