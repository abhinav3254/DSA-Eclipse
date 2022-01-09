package Stack;

import java.util.Scanner;

public class first {
	Scanner sc = new Scanner(System.in);
	int top = -1;
	int[] arr;
	int size;

	public first() {
		// TODO Auto-generated constructor stub
		this.size = 10;
		this.arr = new int[this.size];
	}

	public first(int size) {
		this.size = size;
		this.arr = new int[this.size];
	}

	public void push() {
		if (top + 1 == arr.length - 1) {
			System.out.println("Stack Overflow");
		} else {
			System.out.println("Enter data");
			int data = sc.nextInt();
			top = top + 1;
			arr[top] = data;
		}
	}

	public void pop() {
		if (top == -1) {
			System.out.println("Stack Underflow");
		} else {
			System.out.println(arr[top]);
			top--;
		}
	}

	public static void main(String[] args) {
		first f = new first();
		f.push();
		f.push();
		f.push();
		f.push();
		f.pop();
		f.pop();
		f.pop();
		f.pop();
	}

}
