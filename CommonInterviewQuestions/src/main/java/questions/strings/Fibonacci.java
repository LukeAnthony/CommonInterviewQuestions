package questions.strings;

public class Fibonacci {
  
  public static int recFibN(int n){
    return (n < 2) ? n : recFibN(n-1) + recFibN(n - 2);
  }
  public static void main(String[] args) {
    System.out.println(recFibN(7));
  }
  
}