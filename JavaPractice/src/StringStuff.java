
public class StringStuff {

	public boolean isSubstring(String word, String biggerString) {
		
		if (biggerString.contains(word)) {
			return true;
		}
		return false;
	}
}
