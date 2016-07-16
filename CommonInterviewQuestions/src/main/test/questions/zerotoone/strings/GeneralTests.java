package questions.zerotoone.strings;

import org.junit.Test;

import questions.zerotoone.general.Palindrome;
import static org.junit.Assert.*;

public class GeneralTests {

  @Test
  public void testPalindrome(){
    Palindrome test = new Palindrome();
    assertFalse(test.isPalindrome(null));
    assertFalse(test.isPalindrome(""));
    assertTrue(test.isPalindrome("aba"));
    assertTrue(test.isPalindrome("tenet"));
    assertTrue(test.isPalindrome("amanaplanacanalpanama"));
    assertFalse(test.isPalindrome("A Man A Plan A Canal Panama"));
    assertTrue(test.isPalindrome("a a a"));
    assertFalse(test.isPalindrome("assba"));
  }
  
}
