package questions.strings;

import java.util.Comparator;

/**
 * 
 * @author LukeB
 *
 * Repository: Common Interview Questions
 * Category: Strings
 * Problem: Determine if two strings are anagrams (if they contain the same number and same). I'll ignore case for this problem 
 * 
 * ex) 'Dormitory' and 'Dirty Room' are anagrams
 *
 * Complexity: O(N). Only need to iterate through each string once.
 * @param <T>
 */
public class Anagram {
	
	private String stringOne;
	private String stringTwo;
	
	
	public Anagram(String stringOne, String stringTwo){
		this.stringOne = stringOne.toLowerCase();
		this.stringTwo = stringTwo.toLowerCase();
	}
	
	public String getStringOne() {
		return stringOne;
	}

	public void setStringOne(String stringOne) {
		this.stringOne = stringOne;
	}

	public String getStringTwo() {
		return stringTwo;
	}


	public void setStringTwo(String stringTwo) {
		this.stringTwo = stringTwo;
	}

	public String compare(){
		int stringOneValue = getASCIISum(stringOne);
		int stringTwoValue = getASCIISum(stringTwo);
		
		if(stringOneValue == stringTwoValue)
			return "These two Strings are anagrams";
		else
			return "These two Strings are not anagrams";
	}
	
	private int getASCIISum(String word){
		int sum = 0;
		for(char letters : word.toCharArray()){
			if((letters < 91 && letters > 64) || (letters > 96 && letters < 123))
				sum += (int)letters;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Anagram test = new Anagram("Dormitory", "Dirty Room");
		System.out.println(test.compare());
	}




}
