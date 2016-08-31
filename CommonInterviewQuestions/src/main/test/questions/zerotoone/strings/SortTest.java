package questions.zerotoone.strings;

import static org.junit.Assert.assertArrayEquals;
import static questions.zerotoone.sorts.SortMethods.*;
import org.junit.Ignore;
import org.junit.Test;

public class SortTest {

  @Test
  @Ignore
  public void testSelectionSort(){
    int array[] = {4,1,2,10,9,8,3}; 
    int expectedArray[] = {1,2,3,4,8,9,10};
    selectionSort(array);
    assertArrayEquals(expectedArray, array);
  }
  
  @Test
  @Ignore
  public void testBubbleSort(){
    int array[] = {4,300, 1,2,10,9,0,8,3, 15}; 
    int expectedArray[] = {0,1,2,3,4,8,9,10, 15, 300};
    bubbleSort(array);
    assertArrayEquals(expectedArray, array);
  }
  
  @Test
  @Ignore
  public void testMergeSort(){
    int array[] = {5,4,6,2,1}; 
    int expectedArray[] = {1,2,4,5,6};
    mergeSort(array);
    assertArrayEquals(expectedArray, array);
  }
  
  @Test
  public void testQuickSort(){
    int array[] = {3,1,2,4,5,0}; 
    int expectedArray[] = {0,1,2,3,4,5};
    quickSortCaller(array);
    assertArrayEquals(expectedArray, array);
  }
  
  @Test
  @Ignore
  public void testInsertionSort(){
    int array[] = {300, 4, 1,2,10,9,0,8,3, 15}; 
    int expectedArray[] = {0,1,2,3,4,8,9,10, 15, 300};
    insertionSort(array);
    assertArrayEquals(expectedArray, array);
  }
  
}
