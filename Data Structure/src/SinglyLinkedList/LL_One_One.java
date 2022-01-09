package SinglyLinkedList;
import java.util.*;

// printing data in Order manner

public class LL_One_One {
	static class Node{
		int data;
		Node next;
		public Node(int data) {
			// TODO Auto-generated constructor stub
			this.data = data;
			this.next = null;
		}
	}
	int count_node = 0;
	Node head = null;
	
	void insertData() {
		int n=0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("DATA:");
			int data = sc.nextInt();
			Node node = new Node(data);
			if(head == null) {
				head = node;
			}else {
				Node temp = head;
				while(temp.next!=null) {
					temp = temp.next;
				}
				node.next = temp.next;
				temp.next = node;
			}
			System.out.println("Hit 1 for new Node");
			n = sc.nextInt();
			count_node++;
		}while(n==1);
		
		sc.close();
	}
	
	void pop() {
		if(head==null) {
			System.out.println("LL Empty");
		}else {
			while(head!=null) {
				System.out.println(head.data);
				head = head.next;
			}
		}
	}
	
	public static void main(String[] args) {
		LL_One_One ll = new LL_One_One();
		ll.insertData();
		ll.pop();
		System.out.println("Total Nodes in the Linked List is "+ll.count_node);
	}
}
