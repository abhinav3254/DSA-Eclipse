package recusion_kunal;

public class SortedArray {

	public static void main(String[] args) {
		int[] arr = {10,20,30,40,80,50};
		System.out.println(chkSortI(arr));
	}
	
	static boolean chkSortI(int[] arr) {
		boolean b = true;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1]) {
				b = false;
			}
		}
		
		return b;
	}
}
