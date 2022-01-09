package recusion_kunal;

public class CheckZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		chk1(30204);
		System.out.println(count);
	}

	static int count;
	static void chk1(int n) {
		if(n==0) return;
		int rem = n%10;
		if(rem==0)
			count++;
		chk1(n/10);
	}
}
