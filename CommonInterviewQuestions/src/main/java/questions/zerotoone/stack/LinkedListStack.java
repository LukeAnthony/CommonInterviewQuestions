package questions.zerotoone.stack;

import lombok.Getter;
import lombok.Setter;
import questions.zerotoone.linkedlist.Node;

public class LinkedListStack<T> {
  
  @Getter @Setter
  private Node head;
  
  public LinkedListStack(){
  
  }
  
  public LinkedListStack(Node head){
   this.head=head; 
  }
  
  public Comparable peek(){
    return head.getData();
  }
  
  public Comparable pop(){
    Comparable topNode = head.getData();
    this.setHead(head.getNextNode());
    return topNode;
  }

}
