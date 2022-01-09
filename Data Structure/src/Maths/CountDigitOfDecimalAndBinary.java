package Maths;
public class CountDigitOfDecimalAndBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 6;
		// digit in decimal of 6 is 1
		// binary of 6 is 110 , total digit is 3
		int n = toDecimal(a);
		int n1 = toBinary(a);
		System.out.println("Digits in Decimal is:- "+n);
		System.out.println("Digits in Binary is:- "+n1);
	}
	
	static int toDecimal(int a) {
		int b = 10;
		// base in decimal
		
		int ans = 0;
		ans = (int)(Math.log(a)/Math.log(b))+1;
		return ans;	
	}
	
	static int toBinary(int a) {
		int b = 2;
		// base is 2 in binary
		
		int ans = (int)(Math.log(a)/Math.log(b))+1;
		return ans;
	}
}
