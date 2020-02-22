
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println(doFactorial(4));
	}
	
	public static int doFactorial(int n) {
		if (n < 1) {
			return 1;
		}
		else {
			return n * doFactorial(n-1);
		}
	}
	

}
