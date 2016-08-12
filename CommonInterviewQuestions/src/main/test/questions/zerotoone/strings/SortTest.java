package questions.zerotoone.strings;

import org.junit.Test;
import static org.junit.Assert.*;
import static questions.zerotoone.sorts.SortMethods.*;

public class SortTest {

  @Test
  public void testSelectionSort(){
    int array[] = {4,1,2,10,9,8,3}; 
    int expectedArray[] = {1,2,3,4,8,9,10};
    selectionSort(array);
    assertArrayEquals(expectedArray, array);
  }
  
  @Test
  public void testBubbleSort(){
    int array[] = {4,300, 1,2,10,9,0,8,3, 15}; 
    int expectedArray[] = {0,1,2,3,4,8,9,10, 15, 300};
    bubbleSort(array);
    assertArrayEquals(expectedArray, array);
  }
  
  @Test
  public void testInsertionSort(){
    int array[] = {4,300, 1,2,10,9,0,8,3, 15}; 
    int expectedArray[] = {0,1,2,3,4,8,9,10, 15, 300};
    insertionSort(array);
    assertArrayEquals(expectedArray, array);
  }
  
}
