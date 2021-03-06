package questions.zerotoone.strings;

import org.junit.Test;

import static org.junit.Assert.*;

import questions.zerotoone.linkedlist.DoublyLinkedList;
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
  public void testFindNode(){
    LinkedList list = new LinkedList();
    list.addNodeToEndOfList(new Node("first"));
    list.addNodeToEndOfList(new Node("second"));
    assertNotNull(list.findNode("second"));
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
    list.sortedInsert(new Node(2));
    System.out.println(list.getHead().getData());
    list.sortedInsert(new Node(1));
    System.out.println(list.getHead().getData());
    assertEquals(list.pop(), 1);
  }
  
  @Test
  public void testAppendSecondList(){
    LinkedList listOne = new LinkedList();
    listOne.addNodeToEndOfList(new Node("1"));
    listOne.addNodeToEndOfList(new Node("2"));
    LinkedList listTwo = new LinkedList();
    listOne.addNodeToEndOfList(new Node("3"));
    listOne.addNodeToEndOfList(new Node("4"));
    listOne.appendSecondList(listTwo);
    assertEquals(listOne.getNthNode(3),"3");
  }
  
  @Test
  public void testFrontBackSplit(){
    LinkedList listOne = new LinkedList();
    listOne.addNodeToEndOfList(new Node("1"));
    listOne.addNodeToEndOfList(new Node("2"));
    listOne.addNodeToEndOfList(new Node("3"));
    listOne.addNodeToEndOfList(new Node("4"));
    listOne.addNodeToEndOfList(new Node("5"));
    LinkedList listTwo = listOne.frontBackSplit();
    assertEquals(listTwo.getHead().getData(), "4");
    assertEquals(listTwo.countNodes(), 2);
    assertEquals(listOne.countNodes(), 3);
  }
  
  @Test
  public void testRemoveDuplicates(){
    LinkedList list = new LinkedList();
    list.addNodeToEndOfList(new Node("0"));
    list.addNodeToEndOfList(new Node("0"));
    list.addNodeToEndOfList(new Node("1"));
    list.addNodeToEndOfList(new Node("1"));
    list.addNodeToEndOfList(new Node("1"));
    list.addNodeToEndOfList(new Node("2"));
    list.remodeDuplicates();
    assertEquals(list.pop(), "0");
    assertEquals(list.pop(), "1");
    assertEquals(list.pop(), "2");
  }
  
  @Test
  public void testReverseList(){
    LinkedList list = new LinkedList();
    list.addNodeToEndOfList(new Node(1));
    list.addNodeToEndOfList(new Node(2));
    list.addNodeToEndOfList(new Node(3));
    list.reverseList();
    assertEquals(list.pop(), 3);
    assertEquals(list.pop(), 2);
    assertEquals(list.pop(), 1);
    assertEquals(list.pop(), null);
    assertEquals(list.pop(), null);
  }
  
  @Test
  public void testDoublyLinkedList(){
    DoublyLinkedList dlist = new DoublyLinkedList();
    dlist.addNodeToEndOfList(new Node(1));
    dlist.addNodeToEndOfList(new Node(2));
    assertEquals(dlist.pop(), 1);
    assertEquals(dlist.pop(), 2);
    assertNull(dlist.pop());
    assertNull(dlist.pop());
    assertNull(dlist.pop());
  }
 }
