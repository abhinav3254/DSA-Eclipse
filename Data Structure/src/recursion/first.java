package recursion;

import java.util.Scanner;

public class first {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();
		System.out.println(sum(n));
		sc.close();
	}
	
	static int sum(int n) {
		if(n==0) return n;
		return n%10+sum(n/10);
	}

}
