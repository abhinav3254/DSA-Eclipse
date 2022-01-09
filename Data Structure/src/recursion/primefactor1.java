package recursion;

import java.util.Scanner;

public class primefactor1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		pFactor(num);
		sc.close();
	}
	static void pFactor(int num) {
		if(num==1) return;
		int i = 2;
		while(num%i!=0) 
			i++;
		System.out.println(i);
		pFactor(num/i);
	}
}
