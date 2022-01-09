package recusion_kunal;

import java.util.Scanner;

public class recusrion1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n value");
		int n = sc.nextInt();
		System.out.println(fib(n));
		sc.close();
	}
	
	static int fib(int n) {
		
		if(n==0)
			return 0;
		if(n==1)
			return 1;
		
		return  fib(n-1)+fib(n-2);
	}
}
