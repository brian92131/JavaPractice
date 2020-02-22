import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class StringElimination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Using a Java data structure, eliminate all unnecessary/stop words from a string. 
		Assume you are given the string "To be or not to be - that is the question: Whether 
		it is nobler in the mind to suffer, the slings and arrows of outrageous fortune. 
		Or to take up arms against a sea of troubles, and by opposing end them" 
		
		The unnecessary words to remove are "a", "be", "to", "the", "that", "this", "or" 
		So the resulting string should be like this 
		"not - is question: Whether it is nobler in mind suffer…
		*/
        HashMap <String, Boolean> badWords = new HashMap();
        badWords.put("a", true);
        badWords.put("be", true);
        badWords.put("to", true);
        badWords.put("the", true);
        badWords.put("that", true);
        badWords.put("this", true);
        badWords.put("or", true);
  
        String  theSentence = "To be or not to be - that is the question: Whether " + 
        					 " it is nobler in the mind to suffer, the slings and arrows of outrageous fortune." + 
        					 " Or to take up arms against a sea of troubles, and by opposing end them";
        StringBuilder sb = new StringBuilder();
        String[] splitList = theSentence.split(" ");
        for (int i = 0; i < splitList.length; i++) {
        	String theToken = splitList[i].trim();
        	if (badWords.containsKey(theToken.toLowerCase()) == false) {
        		sb.append(theToken + " ");
        	}
        	//System.out.println("The split list = " + splitList[i]);
        }
        System.out.println(sb);
        
        
	}

}
