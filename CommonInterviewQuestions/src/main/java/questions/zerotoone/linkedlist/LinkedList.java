package questions.zerotoone.linkedlist;

import lombok.Getter;
import lombok.Setter;

public class LinkedList {
  
  @Getter @Setter
  private Node head;
  
  public LinkedList(Node head){
    this.head=head;
  }
  
  public void addNodeToEndOfList(Node node){
    Node listTraverser = new Node();
    listTraverser = head;
    while(listTraverser.getNextNode()!= null){
      listTraverser = listTraverser.getNextNode();
    }
    listTraverser.setNextNode(node);
  }
  
  public Comparable pop(){
    Comparable headData = head.getData();
    this.setHead(head.getNextNode());
    System.out.println(this.getHead().getData());
    return headData;
  }
  
  public int countNodes(){
    int count = 0;
    if(this.head != null){
      count = 1;
    }
    
    Node listTraverser = new Node();
    listTraverser = head;
    //System.out.println(listTraverser.getData());
    while(listTraverser.getNextNode() != null){
      count++;
      listTraverser = listTraverser.getNextNode();
      System.out.println(listTraverser.getData());
    }
    System.out.println(count);
    return count;
  } 
  
  public static void main(String[] ar){
    Node<String> node1 = new Node("First");
    Node<String> node2 = new Node("Second");
    Node<String> node3 = new Node("Third");
    Node<String> node4 = new Node("Fourth");
    LinkedList llist = new LinkedList(node1);
    llist.addNodeToEndOfList(node2);
    llist.addNodeToEndOfList(node3);
    llist.addNodeToEndOfList(node4);
   // System.out.println(llist.pop());
    llist.pop();
    llist.pop();
   llist.countNodes();
    
  }

}