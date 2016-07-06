package questions.zerotoone.strings;

public class Strstr {
  
  public static boolean strstr(String haystack, String needle){
    if(haystack == null || needle == null)
      return false;
    char haystackArray[] = haystack.toCharArray();
    char needleArray[] = needle.toCharArray();
    
    boolean needleInHaystack = false;
    for(int haystackIndex = 0, needleIndex=0 ; haystackIndex < haystackArray.length; haystackIndex++){
      
      if(haystackArray[haystackIndex] == needleArray[needleIndex]){
        
        while(needleIndex < needleArray.length){
          needleIndex++;haystackIndex++;
          if(haystackArray[haystackIndex] != needleArray[needleIndex] || haystackIndex == haystackArray.length - 1 
              || needleIndex == needleArray.length-1){
            break;
          }          
        }
        if(needleIndex != needleArray.length - 1)
          needleIndex = 0;
        else {
          needleInHaystack = true;
          break;
        }
      }
      
    }
    return needleInHaystack;
  }

}
