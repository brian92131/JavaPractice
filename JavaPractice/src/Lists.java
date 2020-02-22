import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class Lists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        doLists();
	}

	private static void doLists() {
		ArrayList <String> arrList = new <String> ArrayList();
		LinkedList <String> linkList = new <String> LinkedList();
		HashMap <String, String> hMap = new <String, String> HashMap();
		
		arrList.add("first");
		arrList.add("second");
		arrList.add("third");
		arrList.add("fourth");
		arrList.add("fifth");
		System.out.println(arrList.get(2));

		linkList.add("first");
		linkList.add("second");
		linkList.add("third");
		linkList.add("fourth");
		linkList.add("fifth");
		System.out.println(linkList);
		linkList.offer("sixth");
		System.out.println(linkList);
		linkList.offerFirst("seventh");
		System.out.println(linkList);
		System.out.println("hash code = " + linkList.hashCode());
		
		
		System.out.println(linkList);
		hMap.put("first", "first");
		hMap.put("second", "second");
		hMap.put("third", "third");
		hMap.put("fourth", "fourth");
		hMap.put("fifth", "fifth");
		System.out.println(hMap.get("second"));
		
	}

}
