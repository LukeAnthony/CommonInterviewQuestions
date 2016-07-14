package questions.zerotoone.general;

import lombok.Getter;
import lombok.Setter;

/*
 * Palindromes read the same from left to right and from right to left.
 *  ex) aba, noon, tenet
 *  
 *  Rules: A null String variable is not a palindrome and neither is an empty String
 *      Spaces are considered characters. Case insensitive
 *      
 *  Efficiency: worst case is O(N/2) (logn?)
 */
public class Palindrome {
  
  public boolean isPalindrome(String word){
    if(word == null) return false;
    else if (word.length()==0) return false;
    else {
      int front = 0, back = word.length() - 1;
      while (back > front){
        if(word.charAt(front) != word.charAt(back)) return false;
        front++; back--;
      }
      return true;
    }
  }
  
}
