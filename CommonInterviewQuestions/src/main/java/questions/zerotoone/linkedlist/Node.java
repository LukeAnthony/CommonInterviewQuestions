package questions.zerotoone.linkedlist;

import java.util.LinkedList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

public class Node<T extends Comparable<T>> {

  @Getter @Setter
  private T data;
  
  @Getter @Setter
  private Node nextNode;

  public Node(){
    setNextNode(null);
  }
  public Node(T data){
    this.data=data;
    setNextNode(null);
  }
  
  public Node(T data, Node nextnode) {
    this.data = data;
    this.nextNode=nextNode;
    setNextNode(null);
  }
 
}
