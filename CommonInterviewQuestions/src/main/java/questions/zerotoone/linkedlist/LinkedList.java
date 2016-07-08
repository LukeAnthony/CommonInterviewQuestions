package questions.zerotoone.linkedlist;

import lombok.Getter;
import lombok.Setter;
import questions.zerotoone.stack.ArrayStack;

public class LinkedList {
  
  @Getter @Setter
  private Node head;
  
  @Getter @Setter
  private Node lastNode;
    
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
    lastNode = node;
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
  
  //splits the current list into two and returns the new second List. If the list has an odd number
  //of elements, the first new list will have an extra element
  public LinkedList frontBackSplit(){
    Node fastIterator = head;
    Node slowIterator = head;
    while(fastIterator != null){
      fastIterator = fastIterator.getNextNode();
      if(fastIterator == null){
        break;
      }
      fastIterator = fastIterator.getNextNode();
      if(fastIterator != null){
        slowIterator = slowIterator.getNextNode();
      }
    }
    
    LinkedList secondHalf = new LinkedList();
    secondHalf.setHead(slowIterator.getNextNode());
    slowIterator.setNextNode(null);
    return secondHalf;
    
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
     addNodeToEndOfList(nodeToBeInserted);
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
  
  //appends the second list to the end of this list
  public void appendSecondList(LinkedList secondList){
    if(secondList == null);
    else
      this.lastNode.setNextNode(secondList.getHead());
  }
  
  //refactor. below works but can be more efficient
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
        if(placeholder.getData().compareTo(nodeToBeInserted.getData() )> 0){
          nodeToBeInserted.setNextNode(head);
          head = nodeToBeInserted;
        }
        else{
          head.setNextNode(nodeToBeInserted);
        }
      }
    }
  
  }
  
  //look at every element and remove duplicate elements. assumes that the list is sorted.
  public void remodeDuplicates(){
    if(this.head == null);
    else if(this.head.getNextNode() == null);
    else{
      Node ahead = head.getNextNode(); Node behind = head;
      while(ahead != null){
        if(ahead.getData() == behind.getData()){
          behind.setNextNode(ahead.getNextNode());
          ahead.setNextNode(null);
          ahead = behind.getNextNode();
        }
        else{
          ahead = ahead.getNextNode(); behind = behind.getNextNode();
        }
        
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
    return count;
  } 

}