package recursion;

import java.util.Scanner;

public class third {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Base:");
	int a = sc.nextInt();
	System.out.print("Enter power");
	int b = sc.nextInt();
	System.out.println();
	System.out.println("Result:- "+pow(a,b));
	sc.close();
}

static int pow(int a,int b) {
	if(b == 0) return 1;
	return a*pow(a,b-1);
}
}