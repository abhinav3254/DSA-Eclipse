package SinglyLinkedList;

public class revreseLinkeedList {
	static class Node{
		int data;
		Node next;
		public Node(int data) {
			// TODO Auto-generated constructor stub
			this.data = data;
			this.next = null;
		}
	}
	Node head = null;
	Node head2 = null;
	Node head3 = null;
	void addElement(int data) {
		Node node = new Node(data);
		if(head==null) {
			head = node;
			head2 = node;
			head3 = node;
		}else {
			head.next = node;
			head = node;
		}
	}
	
	void print() {
		while(head3!=null) {
			System.out.print(" "+head3.data+" ");
			head3 = head3.next;
		}
	}
	
	void reverse() {
		Node current = head2;
		Node prev = null;
		Node next = null;
		while(current!=null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		
		while(prev!=null) {
			System.out.print(" "+prev.data+" ");
			prev = prev.next;
		}
	}
	public static void main(String[] args) {
		revreseLinkeedList rll = new revreseLinkeedList();
		rll.addElement(1);
		rll.addElement(2);
//		System.out.println(rll.head.data);
//		System.out.println(rll.head2.data);
		rll.addElement(3);
		rll.addElement(4);
		rll.print();
		System.out.println();
		System.out.println("After reverse");
		System.out.println();
		rll.reverse();
	}
}