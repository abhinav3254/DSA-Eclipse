package recusion_kunal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Nto1 {
	
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
//		System.out.println("Enter the number");
//		InputStreamReader is = new InputStreamReader(System.in);
//        BufferedReader br = new BufferedReader(is);
//		int n = Integer.parseInt(br.readLine());
		int n = 5;
//		System.out.println(sum(n));
//		System.out.println(fun(n));
		sum(n);
		System.out.println("*************");
		fun(n);
	}

	private static void sum(int n) {
		if(n==0)
			return ;
		else {
			System.out.println(n);
		 sum(n-1);
//		System.out.println();
		}
	}
	
	private static void fun(int n) {
		if(n==0) {
//			return 0;
			return ;
		}
		else {
//		return n+fun(n-1);
			fun(n-1);
		System.out.println(n);
		}
	}
}
