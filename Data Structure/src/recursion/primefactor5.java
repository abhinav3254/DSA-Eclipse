package recursion;
import java.util.Scanner;
public class primefactor5 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter num");
	int num = sc.nextInt();
//	System.out.println();
	pFactor(num);
	sc.close();
}
static void pFactor(int n) {
	if(n==0)
		return;
	int i=2;
	while(n%i!=0)
		i++;
	System.out.println(i);
	pFactor(n/i);
}
}
