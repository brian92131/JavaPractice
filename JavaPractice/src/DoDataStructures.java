import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class DoDataStructures {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arrList = new ArrayList<String>();
		arrList.add("1");
		arrList.add("2");
		arrList.add("3");
		arrList.add("4");
		arrList.add("5");

		for (int i = 0; i < arrList.size(); i++) {
			System.out.println("aList item = " + arrList.get(i));
		}

		System.out.println("aList all = " + arrList);

		LinkedList<String> linkList = new LinkedList<String>();
		linkList.add("1");
		linkList.add("2");
		linkList.add("3");
		linkList.add("4");
		linkList.add("5");
		System.out.println("linkList all = " + linkList);
		System.out.println("linkList 2 = " + linkList.get(2));

		int[][] iRay = { { 41, 2, 3, 4, 5 }, { 81, 32, 33, 34, 35 } };

		int minValue = iRay[0][0];
		int maxValue = iRay[0][0];

		for (int i = 0; i < iRay.length; i++) {
			for (int j = 0; j < iRay[i].length; j++) {
				if (minValue > iRay[i][j]) {
					minValue = iRay[i][j];
				}
				if (maxValue < iRay[i][j]) {
					maxValue = iRay[i][j];
				}

				System.out.println("irayElement = " + iRay[i][j]);
			}
		}
		System.out.println("min value = " + minValue);
		System.out.println("max value = " + maxValue);

		String bigString = "abcdefghijdeabdfa";
		String smallString = "ab";
		int currStringIndex = 0;
		int smallStringLength = smallString.length();
		int count = 0;
		while (currStringIndex + smallStringLength < bigString.length()) {
			System.out.println("substring = " + bigString.substring(currStringIndex, currStringIndex + smallStringLength));
			if (bigString.substring(currStringIndex, currStringIndex + smallStringLength).contentEquals(smallString)) {
				count += 1;
			}
			currStringIndex += smallStringLength;
		}
		System.out.println("count = " + count);
		implementLinkedList();

	}
	
	public static void implementLinkedList() {
		// TODO later
	}
}
