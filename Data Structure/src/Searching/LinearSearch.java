package Searching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LinearSearch {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the element you want to Search");
		int n = Integer.parseInt(br.readLine());
		System.out.println(search(n));
	}
	
	static boolean search(int n) {
		int count = 0;
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		for(int i=0;i<arr.length;i++) {
			if(n==arr[i]) {
				 count = 1;
				break;
			}
			else {
				 count = 0;
			}
		}
		
		if(count == 1)
			return true;
		else
			return false;
	}

}
