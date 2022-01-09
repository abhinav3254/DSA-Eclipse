package Stack;

public class third {
	int top = -1;
	int arr[] ;
	int size;
	
	public third() {
		this.size = 10;
		this.arr = new int[5];
	}
	
	public void push(int item) {
		if(top+1 == size) {
			System.out.println("Stack overflow");
		}else {
			top = top +1;
			arr[top] = item;
		}
		
	}
	
	public void pop() {
		if(top == -1) {
			System.out.println("Stack underflow");
		}
		else {
			System.out.println(arr[top]);
			top --;
		}
	}

}
