package questions.zerotoone.linkedlist;

import lombok.Getter;
import lombok.Setter;
import questions.zerotoone.stack.ArrayStack;

public class LinkedList {
  
  @Getter @Setter
  private Node head;
  
  public LinkedList(){
    
  }
  
  public LinkedList(Node head){
    this.head=head;
  }
  
  //you originally forgot to handle an empty list. Don't make that mistake again!
  public void addNodeToEndOfList(Node node){
    if(head==null){
      head = node;
    }
    else{
    Node listTraverser = new Node();
   
    listTraverser = head;
    while(listTraverser.getNextNode()!= null){
      listTraverser = listTraverser.getNextNode();
    }
    listTraverser.setNextNode(node);
    }
  }
  
  public Comparable pop(){
    if(this.head==null) return null;
    Comparable headData = head.getData();
    
   if(this.head.getNextNode()!=null) {
     this.setHead(head.getNextNode());
   }
   else{
     head = null;
     return headData;
   }
   
    return headData;
  }
  
  public void deleteListContents(){
    this.head=null;
  }
  
  public Comparable getNthNode(int n){
    if(n<=0)return "You silly chicken";
    else if(n==1) return head.getData();
    else{
      int count = 1; Node iterator = head;
      while (count < n && iterator.getNextNode()!=null){
        iterator = iterator.getNextNode();
        count++;
      }
      if(count!=n && iterator.getNextNode()==null)return new String("There aren't enough elements in the list to satisfy you needs");
      else
      return iterator.getData();
    }   
  }
  
  public void insertAtNthPosition(int position, Node nodeToBeInserted){
    if(position==0);
    else if(position==1){
      nodeToBeInserted.setNextNode(head);
      head = nodeToBeInserted;
    }
    else if(position > this.countNodes()){ 
      Node placeholder = head;
      while(placeholder.getNextNode() != null){
        placeholder = head.getNextNode();
      }
      placeholder.setNextNode(nodeToBeInserted);
    }
    else{
      int counter = 1; Node placeholder = head;
      
      while(counter != position - 1){
        placeholder = placeholder.getNextNode();
        counter++;
      }
      nodeToBeInserted.setNextNode(placeholder.getNextNode());
      placeholder.setNextNode(nodeToBeInserted);
    }
  }
  
  public void sortedInsert(Node nodeToBeInserted){
    if(head==null)this.head=nodeToBeInserted;
    else{
      Node placeholder = head;
      if(head.getNextNode()!=null){
      while(nodeToBeInserted.getData().compareTo(placeholder.getNextNode().getData()) < 1){
        placeholder = placeholder.getNextNode();
      }
      nodeToBeInserted.setNextNode(placeholder.getNextNode());
      placeholder.setNextNode(nodeToBeInserted);
    
    }
      else{
        
      }
    }
  
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
    }
    System.out.println(count);
    return count;
  } 
  
  public static void main(String[] ar){
    Node<String> node1 = new Node("First");
    LinkedList llist = new LinkedList();
    llist.addNodeToEndOfList(node1);
    Node<String> node2 = new Node("Second");
    llist.addNodeToEndOfList(node2);
    Node<String> node3 = new Node("Third");
    llist.addNodeToEndOfList(node3);
    Node<String> node4 = new Node("Fourth");
    llist.addNodeToEndOfList(node4);
    System.out.println(llist.getNthNode(1));
  }

}