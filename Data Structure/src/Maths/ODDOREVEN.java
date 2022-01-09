package Maths;

import java.util.Scanner;

public class ODDOREVEN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int k = sc.nextInt();
//		If odd returns True
//		If Even return False
		
		System.out.println(isODD(k));
		
		sc.close();
	}

	private static boolean isODD(int n) {
		// TODO Auto-generated method stub
		return (n&1)==1;
	}

}
