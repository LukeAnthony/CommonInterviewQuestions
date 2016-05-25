package questions.ctci.chapter.one;

import java.util.Arrays;

/**
 * 
 * @author Luke
 *
 * Two strings are a permutation of one another if they are the same length and contain the exact same characters
 *  ex) 'eat' and 'tea'
 *  
 *  Only way to do it is check length first, if different return false, then sort and compare character by character
 *  
 *  Note: remember to ask questions if in a real interview. Good questions here would be: is case sensitivity a factor?
 *      is whitespace significant?
 *  
 *  Complexity: O(sort) + O(N)
 */
public class StringPermutationChecker {
  
  private boolean checkIfStringsArePermutationsOfOneAnother(String firstString, String secondString){
    
    if(firstString.length() != secondString.length())
      return false;
    else{
      char[] stringCharacters = firstString.toCharArray();
      Arrays.sort(stringCharacters);
      firstString = new String(stringCharacters);
      
      stringCharacters = secondString.toCharArray();
      Arrays.sort(stringCharacters);
      secondString = new String(stringCharacters);
      if(firstString.compareTo(secondString) == 0){
        return true;
      }
      
    }
    return false;
  }
  
  private boolean checkPermutationsBooleanArray(String firstString, String secondString){
    if(firstString.length() != secondString.length())
      return false;
    else{
      boolean[] hasCharacterBeenUsed = new boolean[128];
      for(char c : firstString.toCharArray()){
        hasCharacterBeenUsed[c] = true;
      }
      for(char c : secondString.toCharArray()){
        if(!hasCharacterBeenUsed[c]){
          return false;
        }
      }
      return true;
    }
  }
  
  public static void main(String[] args) {
    StringPermutationChecker test = new StringPermutationChecker();
    System.out.println(test.checkPermutationsBooleanArray("eat", "tea"));
  }

}
