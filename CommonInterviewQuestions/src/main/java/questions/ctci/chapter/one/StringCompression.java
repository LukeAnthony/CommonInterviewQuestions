package questions.ctci.chapter.one;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 
 * @author Luke
 *
 *
 * Returns the compressed version of a String if it contains less characters than the original String. Otherwise,
 *  the original String is returned.
 *  
 *  ex) bboooooto = b2o5t1o1
 *  
 *  My solution is O(N) w/ only one iteration. Space complexity is O(N)
 */
public class StringCompression {
  
  public String compressString(String candidate){
    
    int candidateLength = candidate.length();
    StringBuilder compressedCandidate = new StringBuilder();
    int[] currentCharacterFrequency = new int[2];
    
    for(int i = 0; i < candidateLength; i++){
      
      char currentChar = candidate.charAt(i);
      
      if(i == (candidateLength - 1)){
        if(currentChar != candidate.charAt(i-1)){
          compressedCandidate.append((char)currentCharacterFrequency[0]);
          compressedCandidate.append(currentCharacterFrequency[1]);
          compressedCandidate.append((char)currentChar);
          compressedCandidate.append(1);
          
        }
        else{
          compressedCandidate.append((char)currentCharacterFrequency[0]);
          compressedCandidate.append(currentCharacterFrequency[1] + 1);

        }
      }
      
      else if(i == 0){
        currentCharacterFrequency[0] = currentChar;
        currentCharacterFrequency[1] = 1;
      }
      else if(currentCharacterFrequency[0] != currentChar){
        compressedCandidate.append((char)currentCharacterFrequency[0]);
        compressedCandidate.append(currentCharacterFrequency[1]);
        currentCharacterFrequency[0] = currentChar;
        currentCharacterFrequency[1] = 1;
      }
      else{
        currentCharacterFrequency[1]++; 
      }
    }
   
    
    if(compressedCandidate.toString().length() > candidateLength){
      System.out.println(compressedCandidate);
      return candidate;
    }
    else
      System.out.println(compressedCandidate);
      return compressedCandidate.toString();
  }

  public static void main(String[] args) {

    StringCompression test = new StringCompression();
    test.compressString("Bonommooo");

  }
}
