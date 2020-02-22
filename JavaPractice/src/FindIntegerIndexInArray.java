import java.util.Arrays;

public class FindIntegerIndexInArray {

	public static void main (String [] args) {
		Integer [] intArray = new Integer [100];
		Integer integerToFind = new Integer(45);
		int theIndex = -1;
		// populate the array
		for (int i = 0; i < intArray.length; i++) {
		   intArray[i] = i;
		   System.out.println(intArray[i]);
		}
		
		// using a for loop
		for (int i = 0; i < intArray.length; i++) {
			if (intArray[i].intValue() == integerToFind) {
				theIndex = i;
				break;
			}
		}
		System.out.println("the index = " + theIndex);
		
		// not using a for loop
		theIndex = Arrays.asList(intArray).indexOf(integerToFind.intValue());
		System.out.println("the index = " + theIndex);
	}
}
