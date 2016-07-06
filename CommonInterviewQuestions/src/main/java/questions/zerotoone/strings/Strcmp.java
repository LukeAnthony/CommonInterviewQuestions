package questions.zerotoone.strings;

/*
 * strcmp will have take in two strings and will determine which one is lexicographically smaller (comes before in alphabet)
 * 
 * Returns: -1 if string 1 is less than string 2, 0 if the same, 1 if string 1 is greater than string 2
 */
public class Strcmp {

  public static int strcmp(String stringOne, String stringTwo){
    if(stringOne == null || stringTwo == null)
      return 0;
    
    char stringOneChars[] = stringOne.toCharArray();
    char stringTwoChars[] = stringTwo.toCharArray();
    
    int stringOneCharsIndex = 0, stringTwoCharsIndex = 0;
    
    while(stringOneCharsIndex < stringOneChars.length && stringTwoCharsIndex < stringTwoChars.length){
      if(stringOneChars[stringOneCharsIndex] < stringTwoChars[stringTwoCharsIndex]){
        return -1;
      }
      else if(stringOneChars[stringOneCharsIndex] > stringTwoChars[stringTwoCharsIndex])
        return 1;
      else{
        stringOneCharsIndex++; stringTwoCharsIndex++;
      }
    }
    
    if(stringOneCharsIndex < stringOneChars.length){
      return 1;
    }
    else if(stringTwoCharsIndex < stringTwoChars.length){
      return -1;
    }
    else return 0;
  }
  
}
