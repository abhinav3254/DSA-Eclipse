package Searching;

public class BinarySearchOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0,1,2,3,4,5,6,7,8,9};
		int target = -1;
		int ans = binarySearch(target, arr);
		System.out.println(ans);
	}
	
	static int binarySearch(int target,int[] arr) {
		int start = 0;
		int end = arr.length-1;
		while(start<=end) {
			int mid = start+(end-start)/2;
			if(target>arr[mid]) {
				start = mid+1;
			}else  if(target<arr[mid]){
				end = mid-1;
			}else {
				return mid;
			}
		}
		return -1;
	}
}
