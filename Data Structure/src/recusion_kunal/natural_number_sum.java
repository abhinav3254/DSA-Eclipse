package recusion_kunal;
import java.util.*;
public class natural_number_sum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value :");
		int n = sc.nextInt();
		System.out.println(sum(n));
		sc.close();
	}
	
	static int sum(int n) {
		if(n==0) {
			return 0;
		}
		return n+sum(n-1);
	}
}
