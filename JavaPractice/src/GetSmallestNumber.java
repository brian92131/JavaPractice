import java.util.Arrays;

public class GetSmallestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int [] arr = {1, 2, 3, 4, 5};
        System.out.println(getSmallestNumber(arr));
	}

	public static int getSmallestNumber(int [] arr) {
		int [] arrLocal = arr;
		Arrays.sort(arrLocal);
		int retValue = arrLocal[arrLocal.length-1] + 1;
		return retValue;
	}
	
}
