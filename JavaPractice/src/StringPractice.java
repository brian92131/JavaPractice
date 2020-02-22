import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class StringPractice {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		StringStuff ss = new StringStuff();
        boolean returnValue = ss.isSubstring("biggerword", "biggerword");
        System.out.println(returnValue);
        String theString = new String("abcdefg");
        String reversedString = "";
        for (int i = theString.length() - 1; i >= 0; i--) {
           reversedString += theString.charAt(i);
        }
        /*
         * blah 
         * blah
         * blah
         * 
         * 
         */
        System.out.println("reversed string = " + reversedString);
        System.out.println("the number of uncommented lines = " + countUncommentLinesInJavaFile());
        reverseString();
        System.out.println(reverseString2("123456789"));
	}
	
	public static String reverseString2(String originalString) {
		String reversedString = new String();
		for (int i = originalString.length() - 1; i >= 0; i--) {
	           reversedString += originalString.charAt(i);
	       
		}
	    return reversedString;
	}
	
	
	
	
	
	
	
	public static void reverseString() {
		String originalString = "abcd";
		String reversedString = "";
		for (int i = originalString.length()-1; i >= 0; i--) {
			reversedString += originalString.charAt(i);
		}
		System.out.println(reversedString);
	}
	public static int countUncommentLinesInJavaFile () throws IOException {
		BufferedReader fileReader = new BufferedReader(new FileReader("./src/StringPractice.java"));
		String theLine = "";
		int theCount = 0;
		while ((theLine = fileReader.readLine()) != null) {
			if (theLine.trim().startsWith("/*")) {
				while ((theLine = fileReader.readLine()) != null) {
					if (theLine.endsWith("*/")) {
						break;
					}
				}
			}
			else if (theLine.contains("//") == false) {
				theCount++;
			}

		}
		return theCount;
	}
}