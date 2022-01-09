package recursion;
import java.util.*;
public class fibonaci3 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Terms:-");
	int terms = sc.nextInt();
	for(int i=0;i<terms;i++) {
		System.out.print(fib(i)+"  ");
		sc.close();
	}
}
static int fib(int n) {
	if(n==0||n==1)
		return 1;
	return fib(n-1)+fib(n-2);
}
}
