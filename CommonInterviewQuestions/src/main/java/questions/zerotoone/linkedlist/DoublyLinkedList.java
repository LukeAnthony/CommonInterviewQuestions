package questions.zerotoone.linkedlist;

import lombok.Getter;
import lombok.Setter;

public class DoublyLinkedList {

  @Getter
  @Setter
  private Node head;
  private int nodeCount;

  public DoublyLinkedList() {
    this.nodeCount = 0;
  }

  public DoublyLinkedList(Node head) {
    this.head = head;
    this.nodeCount = 1;
  }

  public void addNodeToEndOfList(Node node) {
    if (this.head == null)
      this.head = node;
    else {
      Node traverser = head;
      while (traverser.getNextNode() != null) {
        traverser = traverser.getNextNode();
      }
      traverser.setNextNode(node);
      node.setPreviousNode(traverser);
    }
    this.nodeCount++;
  }

  public Comparable pop() {
    if (this.head != null) {
      if(this.head.getNextNode()==null){
        Comparable headData = head.getData();
        this.head=null;
        return headData;
      }
      Comparable headData = head.getData();

      this.head = this.head.getNextNode();
      this.head.getPreviousNode().setNextNode(null);
      this.head.setPreviousNode(null);
      return headData;
    }
    return null;
  }

}
