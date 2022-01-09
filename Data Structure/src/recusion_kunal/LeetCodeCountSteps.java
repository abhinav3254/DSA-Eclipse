package recusion_kunal;
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
import java.util.*;
import java.io.*;
public class LeetCodeCountSteps {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
System.out.println("Enter a number");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Count(n);
//		Count(123);
		System.out.println(count);
	}
static int count =0;
	static void Count(int n) {
		if(n==0) {
			return;
		}
		else {
			if(n%2==0) {
				n = n/2;
				count++;
			}else {
				if(n%2!=0) {
					n = n-1;
					count++;
				}
			}
//			count++;
		}
		
		Count(n);
	}
}
