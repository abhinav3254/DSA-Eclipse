package recusion_kunal;
import java.util.Scanner;
public class factorial_on_java {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n:");
		int n = sc.nextInt();
		System.out.println(fac(n));
		sc.close();
	}
	
	static int fac(int n) {
		if(n==1) {
			return 1;
		}
		return n*fac(n-1);
	}
}
