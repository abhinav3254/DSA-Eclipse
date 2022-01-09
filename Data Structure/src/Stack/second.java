package Stack;

import java.util.Scanner;

public class second {
	Scanner sc = new Scanner(System.in);
	int top = -1;
	int size;
	int[] arr ;
	
	second(){
		this.size = 5;
		this.arr = new int[this.size];
	}
	
	void push() {
		if(top == arr.length-1)
			System.out.println("Stack Overflow");
		else {
			System.out.print("Enter data: ");
			int data = sc.nextInt();
			top = top+1;
			arr[top] = data;
		}
	}
	
	void pop() {
		if(top==-1) 
			System.out.println("Stack Underflow");
		else {
			System.out.println(arr[top]);
			top = top-1;
		}
	}
	
	public static void main(String[] args) {
		second s = new second();
		Scanner sc = new Scanner(System.in);
		int n,m;
		do {
			s.push();
			System.out.println("Hit 1 for new element to insert/nhit 0 for exit");
			n = sc.nextInt();
		}while(n==1);
		
		System.out.println("-----poping elemnets-----------");
		try {
			Thread.sleep(2000);
		}catch(Exception e) {System.out.println(e);}
		do {
			s.pop();
			System.out.println("Hit 1 for print new element/nhit 0 for exit");
			m = sc.nextInt();
		}while(m==1);
		sc.close();
	}

}
