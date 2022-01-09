package recusion_kunal;

public class PalindromorNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 1234351;
		System.out.println(chk(n));
	}
	static int sum = 0;
	static void rev(int n) {
		if(n==0) return;
		int rem = n%10;
		sum = sum*10+rem;
		rev(n/10);
	}
	
	static boolean chk(int n) {
//		return true;
//		if(n==rev(n))
		rev(n);
		return (n==sum);
	}

}
