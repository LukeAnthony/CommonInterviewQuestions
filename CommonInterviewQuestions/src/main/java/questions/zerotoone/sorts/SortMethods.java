package questions.zerotoone.sorts;



/*
 * This class will contain my implementations of some of the most famous sort methods
 */
public class SortMethods {

  /*
   * Selection sort iterates through each index and places the element that is the (x+1)th smallest
   * in that index. For example, the array [4,1,2,10] would start at index 0 and would look for the
   * smallest number. In this case, that is 1, so the array would then look like this: [1,4,2,10].
   * Then, the array would start at index 1 and look for the 2nd smallest number....
   * 
   * Efficiency: Worst case O(N2).
   * 
   * Stable? No
   * 
   * Space Complexity: O(1) because no extra space is allocated for this method
   * 
   * General Notes: Originally, I had integer variables for the smallest number and for its index in
   * the array. I would swap the smallest number at the end rather than swap all candidates like
   * below. I believe that this uses less memory, so is the implementation that I will go with.
   */
  public static int[] selectionSort(int array[]) {
    int length = array.length;

    for (int xthElementInArray = 0; xthElementInArray < length; xthElementInArray++) {
      int placeholder = 0;
      for (int elementComparison =
          xthElementInArray + 1; elementComparison < length; elementComparison++) {
        if (array[elementComparison] < array[xthElementInArray]) {
          placeholder = array[xthElementInArray];
          array[xthElementInArray] = array[elementComparison];
          array[elementComparison] = placeholder;
        }
      }
    }
    return array;
  }

  /*
   * Bubble sort iterates through the array and compares each element's neighbor. If the element is
   * greater than its neighbor, then the two are swapped. It continues to iterate through the array
   * until no swaps are made, meaning that the array is sorted.
   * 
   * Efficiency: Worst case is O(N2). Best is O(N) when list is already sorted ex) {9,8,7,6} ->
   * {8,7,6,9} -> {7,6,8,9} -> {6,7,8,9}. Four iterations w/ four elements = 16 comparisons, making
   * it O(N2)
   * 
   * Stable? Yes!
   * 
   * Space Complexity: O(1)
   * 
   * General Notes: You could do without the while loop and use a for loop instead.
   */
  public static int[] bubbleSort(int array[]) {
    int length = array.length;
    boolean swapThisIteration = true;

    while (swapThisIteration == true) {
      swapThisIteration = false;
      for (int index = 0; index < length; index++) {
        if ((index + 1) != length && array[index] > array[index + 1]) {
          int placeholder = array[index];
          array[index] = array[index + 1];
          array[index + 1] = placeholder;
          swapThisIteration = true;
        }
      }
    }
    return array;
  }

  /*
   * Insertion sort begins its sort with a sorted sub-list with one element (a list with one element
   * is always sorted). You move throughout the array and add elements to this list, sorting the
   * list once they are added
   * 
   * Efficiency: O(N2)
   * 
   * Stable? Yes
   * 
   * Space Complexity: O(1)
   * 
   * General Notes: Original is not insertion sort. Right idea, but swapping from left to right
   * isn't what the algorithm does. You should move the backOfList element from right to left,
   * comparing the latest addition of the list to all prior entries. Original is stable.
   */
  public static int[] insertionSort(int array[]) {
    int length = array.length;

    /*
     * Original Implementation for(int backOfList = 0; backOfList < length; backOfList++){ for(int
     * frontOfList = 0; frontOfList < backOfList; frontOfList++ ){ if(array[frontOfList] >
     * array[backOfList]){ int placeHolder = array[frontOfList]; array[frontOfList] =
     * array[backOfList]; array[backOfList] = placeHolder; } } }
     */

    for (int listFrontier = 1; listFrontier < length; listFrontier++) {
      for (int backOfList = listFrontier; backOfList > 0; backOfList--) {
        if (array[backOfList] < array[backOfList - 1]) {
          int placeHolder = array[backOfList];
          array[backOfList] = array[backOfList - 1];
          array[backOfList - 1] = placeHolder;
        }
      }
    }
    return array;
  }
  
  /*
   * Merge sort
   * 
   * Efficiency: O(N log(N))
   * 
   * Stable? Yes!
   * 
   * Space Complexity: O(N)
   * 
   * General Notes: This was a nightmare to code
   */
  public static void mergeSort(int list[]) {
    if(list.length==1){
      return;
    }
    int firstHalf[] = new int[list.length/2 + list.length%2];
    int secondHalf[] = new int[list.length/2];
    
    splitForMergeSort(list, firstHalf, secondHalf);
    
    mergeSort(firstHalf);
    mergeSort(secondHalf);
    
    mergeForMergeSort(list, firstHalf, secondHalf);

  }
  
  private static void splitForMergeSort(int originalList[], int firstHalf[], int secondHalf[]){
    int index = 0;
    int secondHalfIndex = firstHalf.length;
    for(int elements: originalList){
      if(index < secondHalfIndex){
        firstHalf[index] = originalList[index];
      }
      else{
        secondHalf[index-secondHalfIndex] = originalList[index];
       
      }
      index++;
    }
  }
  
  //combines final two sorted lists and sorts them into the final product
  private static int[] mergeForMergeSort(int originalList[], int firstHalf[], int secondHalf[]){
    int mergeIndex=0,firstHalfIndex=0,secondHalfIndex=0;
    
    while(firstHalfIndex < firstHalf.length && secondHalfIndex < secondHalf.length){
      if(firstHalf[firstHalfIndex] < secondHalf[secondHalfIndex]){
        originalList[mergeIndex] = firstHalf[firstHalfIndex];
        firstHalfIndex++;
      }
      else if(secondHalfIndex < secondHalf.length){
        originalList[mergeIndex] = secondHalf[secondHalfIndex];
        secondHalfIndex++;
      }
      mergeIndex++;
    }
    
    if(firstHalfIndex < firstHalf.length){
      while(mergeIndex < originalList.length){
        originalList[mergeIndex++] = firstHalf[firstHalfIndex++];
      }
    }
    
    if(secondHalfIndex < secondHalf.length){
      while(mergeIndex < originalList.length){
        originalList[mergeIndex++] = secondHalf[secondHalfIndex++];
      }
    }
    
    return null;
  }


  /*
   * Quick sort
   * 
   * Efficiency: O(N log(N)) in most cases, worst case is O(N2)
   * 
   * Stable? Yes!
   * 
   * Space Complexity: O(1)
   * 
   * General Notes: Uses a pivot to partition the list. Choose the first or last element as the first pivot.
   *    Could also choose the pivot randomly. Put all elements smaller than the pivot to the left, larger to 
   *    the right. This will partition the list into two parts. 
   */
  public static void quickSortCaller(int[] list){
    quickSort(list,0,list.length-1);
  }
  
  public static void quickSort(int[] list, int low, int high){
    if(low >= high) return ;
    int pivotIndex = quickSortPartition(list, low, high);
    quickSort(list, low, pivotIndex-1);
    quickSort(list, pivotIndex+1,high);
  }
  
  public static void swap(int[] list, int low, int high){
    int temp = list[low]; //low=3, high=10
    list[low] = list[high];
    list[high] = temp;
  }

  public static int quickSortPartition(int[] list, int lowIndex, int highIndex){
    int pivot = list[lowIndex];
    int l = lowIndex, h = highIndex;
    while(l < h){
      while(list[l] <= pivot && l < h){
        l++;
      }
      while(list[h]>pivot){
        h--;
      }
      if(l<h){
        swap(list, l, h);
      }
    }
    swap(list,lowIndex,h); 
    return h;
  } 
}
