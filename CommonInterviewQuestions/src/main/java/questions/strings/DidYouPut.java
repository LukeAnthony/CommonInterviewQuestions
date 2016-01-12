package questions.strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DidYouPut {

  public static void main(String[] args) {
    ArrayList<Integer> winningNumbers = new ArrayList<Integer>();
    int actualPowerball, yourPowerball;
    ArrayList<Integer> yourNumbers = new ArrayList<Integer>();

    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the winning numbers");
    int count = 0;
    while (count < 5) {
      winningNumbers.add(scan.nextInt());
      count++;
    }
    System.out.println("Enter the winning powerball");
    actualPowerball = scan.nextInt();

    for (int i = 0; i < 14; i++) {
      System.out.println("Enter your numbers, excluding the powerball");
      count = 0;
      while (count < 5) {
        yourNumbers.add(scan.nextInt());
        count++;
      }
      System.out.println("Enter your powerball");
      yourPowerball = scan.nextInt();
      
      Collections.sort(winningNumbers);
      Collections.sort(yourNumbers);
      String winningNumbersToString = "";
      String yourNumbersToString = "";
      
      boolean winner = winningNumbersToString.equals(yourNumbersToString);
      if (yourPowerball == actualPowerball) {
        System.out.println("You might have won the grand prize. Let's see...");
        if (winner) {
          System.out.println("HOLY SHIT YOU'RE WORTH MILLIONS");
        } else {
          System.out.println("Nah, you just won the powerball");
        }
      } else {
        System.out.println("didn't win the powerball but let's see if you have all four....");
        if (winner) {
          System.out.println("YOU GOT ALL 4 RIGHT! I THINK THAT MEANS YOU'RE A MILLIONAIRE");
        } else {
          System.out.println("You didn't win shit. Go back to work");
        }
      }


    }


  }
}
