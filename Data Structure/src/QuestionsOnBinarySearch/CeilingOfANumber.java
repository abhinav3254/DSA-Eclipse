package QuestionsOnBinarySearch;

public class CeilingOfANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = {10,20,30,40,50,60,70,80,90,100};
		int k = ceiling(arr, 45);
		System.out.println("Celing of the number is "+k);
	}
	
	static int ceiling(int[] arr,int target) {
		
		int s = 0;
		int e = arr.length-1;
		while(s<=e) {
			int mid = s+(e-s)/2;
			if(target>arr[mid]) {
				//go right side
				s = mid+1;
			}else if(target<arr[mid]) {
				// go to left side
				e = mid-1;
			}
			else {
				return arr[mid];
			}
		}
		
		return arr[s];
	}

}
