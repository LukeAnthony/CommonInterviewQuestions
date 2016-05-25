package questions.java8;

interface Run {
  public int runAtCertainSpeed(int c);
}

class Runner{
  
  public void startRunning(Run r, int d) {
    System.out.println("Person running and their speed ");
    int x = r.runAtCertainSpeed(d);
    System.out.println("running at " + x + "speed");
  }
}


public class LambdaExpressions {

public static void main(String[] args) {
  
  Runner runner = new Runner();
  
//  Pre-Java8 
//  runner.startRunning(new Run() {
//    @Override
//    public int runAtCertainSpeed(){
//      return 5;
//    }
//  });
  

//  Java 8
  runner.startRunning((int f) -> ( f + 4 ), 123);
  
  
}
  
}
