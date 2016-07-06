package questions.zerotoone.strings;

import org.junit.Test;

import static org.junit.Assert.*;
import questions.zerotoone.linkedlist.LinkedList;
import questions.zerotoone.linkedlist.Node;

public class LinkedListTest {

  @Test
  public void testPop(){
    LinkedList list = new LinkedList();
    list.addNodeToEndOfList(new Node("First"));
    list.addNodeToEndOfList(new Node("Second"));
    Node shouldBeFirst = new Node(list.pop());
    
    assertEquals(shouldBeFirst.getData(), "First");
    assertEquals(list.pop(), (Comparable) "Second");
    assertNull(list.pop());
    
  }
  
  @Test
  public void testDeleteList(){
    LinkedList list = new LinkedList();
    list.addNodeToEndOfList(new Node("first"));
    list.addNodeToEndOfList(new Node("second"));
    list.deleteListContents();
    assertNull(list.getHead());
    assertNull(list.pop());
    
  }
  
  @Test
  public void testInsertAtNthPosition(){
    LinkedList list = new LinkedList();
    list.addNodeToEndOfList(new Node("first"));
    list.addNodeToEndOfList(new Node("second"));
    list.insertAtNthPosition(3, new Node("third"));
    assertEquals(list.getNthNode(3),"third");
    list.insertAtNthPosition(2, new Node("new second"));
    assertEquals(list.getNthNode(2),"new second");
    assertEquals(list.getNthNode(3),"second");
   }
  
  @Test
  public void testSortedInsert(){
    LinkedList list = new LinkedList();
    list.sortedInsert(new Node(1));
    list.sortedInsert(new Node(2));
    assertEquals(list.pop(), 1);
  }
}
