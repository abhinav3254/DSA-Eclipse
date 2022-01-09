package recursion;
import java.util.*;
public class prime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		do {
			System.out.print("Enter value for n: ");
			
			int n = sc.nextInt();
			if(chkPrime(n, 2)==1)
				System.out.println("yes prime");
			if(chkPrime(n, 2)==0) {
				System.out.println("Not prime");
			}
			try {
				Thread.sleep(2000);
			}catch(Exception e){
				System.out.println(e);
			}
			System.out.println("Hit 1 for new check");
			choice = sc.nextInt();
		}while(choice == 1);
		sc.close();
	}
	
	static int chkPrime(int n, int i) {
		if(n<=2|| i==n) {
			return 1;
		}
		
		if(n%i==0) {
			return 0;
		}
		
		i++;
		
		return chkPrime(n, i);
	}
}
