package questions.zerotoone.general;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class DocumentChunk {

  public static String sendDocumentInChunks(String document) {
    StringBuilder portionBuilder = new StringBuilder();
    StringBuilder portion = new StringBuilder();
    int iterator = 0;
    int charCount = 0;
    boolean needToSkipOverColon = false;

    while (charCount != 20) {
      if (needToSkipOverColon != true) {
        if(iterator > document.length()-1){
          return portion.append(portionBuilder).toString();
        }
        else
        if (document.charAt(iterator) != ':') {
          portionBuilder.append(document.charAt(iterator));
          charCount++; iterator++;
        } else {
          needToSkipOverColon = true;
        }
      } else {
        iterator++;
        portion.append(portionBuilder); 
        portionBuilder = new StringBuilder("");
        needToSkipOverColon = false;
      }
    }
    if (portion.length() != 0) {
      return portion.toString();
    } 
    else {
      while (document.charAt(charCount) != ':') {
        portionBuilder.append(document.charAt(charCount));
        charCount++;
      }
      return portion.append(portionBuilder).toString();
    }

  }

   public static void main(String[] args) {
    
   String test = "Testing this thing out: The last sentence should get printed. This one should not";
   System.out.println(DocumentChunk.sendDocumentInChunks(test));
  
  }
}
