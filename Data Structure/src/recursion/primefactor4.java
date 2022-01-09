package recursion;
import java.util.*;
public class primefactor4 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Data");
	int data = sc.nextInt();
	pFactor(data);
	sc.close();
}
static void pFactor(int num) {
	if(num==1)
		return ;
	int i =2;
	while(num%i!=0)
		i++;
	System.out.println(i);
	pFactor(num/i);
}
}
