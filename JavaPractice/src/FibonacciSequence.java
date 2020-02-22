
public class FibonacciSequence {

	static int bigOh = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println(doFibRecursive(9));
		System.out.println("bigOh = " + bigOh);
        bigOh = 0;
        System.out.println(doFibNonRecursive(9));
		System.out.println("bigOh = " + bigOh);
	}
	
	public static int doFibRecursive (int theIndex) {
        bigOh++;
		if (theIndex <= 1) {
			return theIndex;
		}
		return doFibRecursive(theIndex-1) + doFibRecursive(theIndex-2);
		
	}
	
	public static int doFibNonRecursive(int theIndex) {
		int sizeOfArray = theIndex+1;
		int [] fibSequence = new int[sizeOfArray];
		fibSequence[0] = 0;
		fibSequence[1] = 1;
		for (int n = 2; n < sizeOfArray; n++) {
			fibSequence[n] = fibSequence[n-1] + fibSequence[n-2];
			bigOh++;
		}
		return fibSequence[sizeOfArray-1];
	
	}

}
