package Searching;
import java.util.*;
public class LinearSearchOne {
	
	static int search(int[] arr,int n) {
		for(int i=0;i<arr.length;i++) {
			if(n==arr[i])
				return i;
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = {2,4,6,8,10,12,14,16,18,20};
		System.out.println("Enter the element to be searched");
		int n = sc.nextInt();
		int k = search(arr, n);
		if(k!=-1) {
			System.out.println("Item found at index "+k);
		}else {
			System.out.println("Item Not Found");
		}
		sc.close();
	}
}
