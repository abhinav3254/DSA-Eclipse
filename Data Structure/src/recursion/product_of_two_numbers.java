package recursion;
import java.util.*;
public class product_of_two_numbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value for x and y ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.println(productOfNumbers(x, y));
		sc.close();
	}
	
	static int productOfNumbers(int x,int y) {
		if(y==0)
			return 0;
		return x+productOfNumbers(x, y-1);
	}
}
