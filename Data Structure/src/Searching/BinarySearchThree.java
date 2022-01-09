package Searching;
import java.util.*;
public class BinarySearchThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr = {10,20,30,40,50,60,70,80};
		System.out.println("Enter the element to be searched");
		int n = sc.nextInt();
		int k = bsSearch(arr, n);
		System.out.println("Element present at index:-"+k);
		sc.close();
	}
	
	static int bsSearch(int[] arr,int n) {
		int start = 0;
		int end = arr.length-1;
		while(start<=end) {
			int mid = start+(end-start)/2;
			if(n>arr[mid]) {
				// right side
				start = mid+1;
			}else if(n<arr[mid]) {
				// left side
				end = mid-1;
			}else {
				return mid;
			}
		}
		return -1;
	}

}
