package Maths;

public class NumberOFSetBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 45;
		
		System.out.println(Integer.toBinaryString(n));
		
		System.out.println(isCount(n));
	}

	private static int isCount(int n) {
		// TODO Auto-generated method stub
		int count = 0;
		while(n>0) {
			count++;
			n = (n&(n-1));
		}
		return count;
	}

}
