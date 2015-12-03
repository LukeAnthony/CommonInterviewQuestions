package questions.strings;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FirstNonRepeatedCharacter {
	
	/**
	 * Repository: Common Interview Questions
	 * Category: Strings
	 */
	
	/**
	 * Problem: Find the first non-repeated character in a String
	 * 
	 * ex) In 'Luke', 'L' is the first non-repeated character.
	 * 	   In 'Charcandrick', 'h' is the first non-repeated character.
	 * 
	 * Solution: Create an empty linked hash map. Iterate through the string and check if each character is already in the map. If not, add it to the map with a value of 1. If so, increment the current
	 * 	value by 1. Next, iterate through map until you find a value of 1. The corresponding key is the answer. If no values are equal to 1, then a  non-repeated character does not exist for that String.
	 * 	
	 * 
	 * Complexity: O(N). Whole string will be scanned in all cases. Whole map will be scanned only if the last character added is the first non repeated character
	 * 
	 * Rational: I used a linked hash map because it keeps track of the order in which keys are entered into it. I also decided against using a third party String modifying library, like Apache's
	 * 	'StringUtils' or 'Google Guava'. I wanted to use as much pure java as possible. 
	 */
	public static void main(String[] args) {
		
		String evaluatee = "Charcandrick";
		char[] charactersInEvaluatee = evaluatee.toLowerCase().toCharArray(); char answer = '\0';
		Map<Character, Integer> characterFrequency = new LinkedHashMap<>();
		
		for(char character : charactersInEvaluatee){
			if(characterFrequency.containsKey(character)){
					characterFrequency.replace(character, characterFrequency.get(character) + 1);
			}
			else{
				characterFrequency.put(character, 1);
			}
		}
		
		for(Character key : characterFrequency.keySet()){
			if(characterFrequency.get(key) == 1){
				answer = key;
				break;
			}
		}
		if(answer !='\0')		
			System.out.println("The first non repeated character in the string " + evaluatee + " is " + answer);
		else
			System.out.println("There are no unique characters in this string");
		
		
	}

}
