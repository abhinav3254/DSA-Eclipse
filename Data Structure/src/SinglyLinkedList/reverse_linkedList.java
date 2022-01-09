package SinglyLinkedList;

public class reverse_linkedList {
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	
	Node head = null;
	Node head2 = null;
	public void addElement(int data) {
		Node new_node = new Node(data);
		if(head==null) {
			head = new_node;
			head2 = new_node;
		}else {
			head.next = new_node;
			head = new_node;
		}
	}
	
	public void print(Node node) {
		while(node!=null) {
			System.out.print(" "+node.data+" ");
			node = node.next;
		}
	}
	
	public Node reverse(Node node) {
//		Node node = head2;
		Node current=node;
		Node prev = null;
		Node next = null;
		
		while(current!=null) {
			next = current.next; 
			current.next = null;
			prev = current;
			current = next;
		}
		node = prev;
		return node;
	}
	public static void main(String[] args) {
		reverse_linkedList rll = new reverse_linkedList();
		rll.addElement(1);
		rll.addElement(2);
		rll.addElement(3);
		rll.addElement(4);
		rll.print(rll.head2);
		System.out.println();
		rll.reverse(rll.head);
		rll.print(rll.head2);
	}
	
}
