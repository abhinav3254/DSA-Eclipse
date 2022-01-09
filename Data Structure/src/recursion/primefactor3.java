package recursion;
import java.util.*;
public class primefactor3 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Data");
	int num = sc.nextInt();
	pFcator(num);
	sc.close();
}
static void pFcator(int num) {
	if(num==1)
		return;
	int i = 2;
	while(num%i!=0)
		i++;
	System.out.println(i);
	pFcator(num/i);
}
}
