package Array;

//import java.util.Arrays;

public class findelemnt {
	
	public static void main(String[] args) {
		int[] arr = {12,45,1,89,2,3,7,6,25};
		int key = 1202554;
//		Arrays.sort(arr);
//		System.out.println(arr[2]);
		
		System.out.println(findKey(arr, key));
		
		
	}
	
	static boolean findKey(int[] arr,int key) {
		int i ;
		for(i=0;i<arr.length;i++) {
			if(key==arr[i]) {
				return true;
			}
		}
		return false;
	}

}
