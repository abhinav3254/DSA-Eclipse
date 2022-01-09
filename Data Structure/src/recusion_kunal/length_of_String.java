package recusion_kunal;
import java.util.*;
public class length_of_String {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		String data = sc.nextLine();
		int m = reclen(data);
		System.out.println(m);
		sc.close();
	}
	
	static int reclen(String data) {
		if(data.equals("")) {
			return 0;
		}
		
		return reclen(data.substring(1))+1;
		
	}

}
