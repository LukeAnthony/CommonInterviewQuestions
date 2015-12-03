package questions.strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedCharacter {
	
	/**
	 * Repository: Common Interview Questions
	 * Category: Strings
	 * Problem: Find the first non-repeated character in a String
	 * 
	 * ex) In 'Luke', 'L' is the first non-repeated character.
	 * 	   In 'Charcandrick', 'h' is the first non-repeated character.
	 * 
	 * Solution: Create an empty linked hash map. Iterate through the string and check if each character is already in the map. If not, add it to the map with a value of 1. If so, increment the current
	 * 	value by 1. Next, iterate through map until you find a value of 1. The corresponding key is the answer. If no values are equal to 1, then a  non-repeated character does not exist for that String.
	 * 
	 * Complexity: O(N). Whole string will be scanned in all cases. Whole map will be scanned only if the last character added is the first non repeated character
	 * 
	 * Rational: I used a linked hash map because it keeps track of the order in which keys are entered into it. I also decided against using a third party String modifying library, like Apache's
	 * 	'StringUtils' or 'Google Guava'. I wanted to use as much pure java as possible. 
	 */
	private String evaluatee;
	private char[] charactersInEvaluatee;
	private Map<Character, Integer> characterFrequency = new LinkedHashMap<>();
	
	public FirstNonRepeatedCharacter(String evaluatee){
		this.evaluatee = evaluatee;
		charactersInEvaluatee = evaluatee.toLowerCase().toCharArray();
	}
	
	private void evaluateCharacterFrequencies(){
		
		for(char character : charactersInEvaluatee){
		  if(character != ' ')
			if(characterFrequency.containsKey(character)){
					characterFrequency.replace(character, characterFrequency.get(character) + 1);
			}
			else{
				characterFrequency.put(character, 1);
			}
		}
	}
	
	private String findFirstRepeatedCharacter(){
		
		for(Character key : characterFrequency.keySet()){
			if(characterFrequency.get(key) == 1){
				return( "The first non repeated character in the string " + evaluatee + " is " + key);
			}
		}
		
		return ("There are no unique characters in this " + evaluatee);
	}
	
	public static void main(String[] args) {
		
		FirstNonRepeatedCharacter test = new FirstNonRepeatedCharacter("The Dear Hunter");
		test.evaluateCharacterFrequencies();
		System.out.println(test.findFirstRepeatedCharacter());
			
	}

}
