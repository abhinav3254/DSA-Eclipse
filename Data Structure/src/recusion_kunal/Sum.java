package recusion_kunal;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 1234;
//		System.out.println(fun(n));
//        System.out.println(fun2(n));
		print();
	}

	private static int fun(int n){
        if(n==0){
            return 0;
        }else{
            return n%10+fun(n/10);
        }
    }

    private static int fun2(int n){ 
        int sum =0;
        int rem = 0;
        while(n!=0){
            rem  = n%10;
            sum = sum+rem;
            n/=10;
        }

        return sum;
    }
    
    static void print() {
//    	int n1 = 1;
    	System.out.println(1%10);
    }
}
