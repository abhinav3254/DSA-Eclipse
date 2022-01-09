package Maths;

public class TWOPOWERORNOT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 89;
		
//		 boolean b = (n&(n-1))==0;
//		System.out.println(b);
		if(n==0) {
			System.out.println("false");
		}else
		System.out.print((n&(n-1))==0);
		
		// if we put n = 0 then it will give zero in that case also this is an exception case
//		to overcome this simple return false for n=0

	}
	
}
