
public class SortArray {

	public static void main(String[] args) {
		int [] array = { 10, 4, 1, 2, 8, 5};
		int [] resultantArray = doNormalSort(array);
		for (int i = 0; i < resultantArray.length; i++) {
			System.out.println(resultantArray[i]);
		}

	}

	private static int[]  doNormalSort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i+1; j < array.length; j++) {
				if (array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		return array;
	}

}
