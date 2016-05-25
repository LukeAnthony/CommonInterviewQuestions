package questions.ctci.chapter.one;

/**
 * 
 * @author Luke
 *
 * Question 1 from the first chapter. Determines whether or not the String has all unique characters in it. Goal is not to use any extra data structures
 * 
 * Difference between ASCII & Unicode? -> 
 * 
 * Outline: I imagine the data structure of choice would be a hash map. map characters, if no collision it is unique. maybe re-create that?
 * Best case : faster than O(N), worst case O(N)
 *
 */
public class StringCharacterEvaluator {

  
  public static void main(String[] args) {
    String subject = "Luke".toUpperCase(); //obviously does not contain all unique characters
    
    boolean allUnique = true;
    int[] characterArray = new int[128];
    
    for(int i = 0; i < subject.length(); i++){
      if(characterArray[(int)subject.charAt(i)] !=  subject.charAt(i))
        characterArray[subject.charAt(i)] = subject.charAt(i);
      else{
        System.out.println("This string does not contain all unique characters");
        allUnique = false;
        break;
      } 
    }
  
    if(allUnique)
        System.out.println("This string does contain all unique characters");
    
  }
  
}
