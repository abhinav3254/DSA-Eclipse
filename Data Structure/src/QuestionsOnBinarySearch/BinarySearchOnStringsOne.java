package QuestionsOnBinarySearch;

public class BinarySearchOnStringsOne {
	
	static int bsString(String[] arr,String target){
		int s = 0;
		int e = arr.length-1;
		while(s<=e) {
			int mid = s+(e-s)/2;
			int res = target.compareTo(arr[mid]);
			if(res==0) {
				return mid;
			}else if(res>0) {s=mid+1;}else if(res<0) {e = mid-1;}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = { "contribute", "geeks", "ide", "practice"};
		String x = "geeks";
		int k = bsString(arr, x);
		if(k!=-1) {
			System.out.println("String Found at String "+k);
		}else {
			System.out.println("String Not found");
		}
	}

}
