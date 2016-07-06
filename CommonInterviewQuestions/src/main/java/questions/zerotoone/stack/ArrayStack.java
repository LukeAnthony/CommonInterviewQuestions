package questions.zerotoone.stack;

public class ArrayStack<T> {
  
  private T[] stack;
  private int index;
  
  public ArrayStack(){
    this.stack = (T[]) new Object[100];
    index = 0;
  }

  public ArrayStack(int size){
    this.stack=(T[]) new Object[size];
  }
  
  //catch exception for pushing on full stack
  public void push(T element){
    stack[index++] = element;
  }
  
  public boolean isFull(){
    return index==stack.length;
  }
  
  public boolean isEmpty(){
    return index == 0;
  }
  
  public int getStack(){
    return this.stack.length;
  }
  
  public static void main(String[] args) {
    ArrayStack<String> stack = new ArrayStack<String>(90);
    stack.push("");
    stack.push("");
  }
  
}
