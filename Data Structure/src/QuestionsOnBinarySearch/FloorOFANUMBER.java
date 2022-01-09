package QuestionsOnBinarySearch;

public class FloorOFANUMBER {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,20,30,40,50,60,70,80,90,100};
		int k = floor(arr,99);
		System.out.println("Floor value is "+k);
	}
	
	static int floor(int[] arr,int target) {
		int s = 0;
		int e = arr.length-1;
		while(s<=e) {
			int mid = s+(e-s)/2;
			if(target<arr[mid]) {
				//left side
				e = mid-1;
			}
			else if(target>arr[mid]) {
				//right side
				s = mid+1;
			}
			else {
				return arr[mid];
			}
		}
		return arr[e];
	}
}
