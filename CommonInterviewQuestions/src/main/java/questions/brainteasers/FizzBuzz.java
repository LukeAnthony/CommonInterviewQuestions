package questions.brainteasers;

import java.util.Scanner;

public class FizzBuzz {
  
  public static void main(String[] args) {
    Scanner scan  = new Scanner(System.in);
    System.out.println("Enter a number");
    int input = scan.nextInt();
    if(input % 15 == 0){
      System.out.println("FizzBuzz");
    }
    else if(input % 5 == 0){
      System.out.println("Buzz");
    }
    else if(input % 3 == 0){
      System.out.println("Fizz");
    }
    else{
      System.out.println("Your word doesn't fizz, buzz, or fizzbuzz");
    }
  }

}
