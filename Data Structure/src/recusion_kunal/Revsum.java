package recusion_kunal;

public class Revsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		rev(1234);
		System.out.println(recrev(1234));
	}
	
	private static void rev(int n) {
		int rem=0,sum=0;
		while(n!=0) {
			rem=n%10;
			sum = sum*10+rem;
			n/=10;
		}
		
		System.out.println(sum);
	}

	private static int recrev(int n) {
		if(n%10==n) {
			return n;
		}else {
			return (n%10)*10+recrev(n/10);
		}
	}
}
