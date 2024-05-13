
package bubblesort;
public class BubbleSort {
  static void bubbleAscending(int[] my_array) {
    int n = my_array.length;
    int temp = 0;
    for (int i = 0; i < n; i++) {
      for (int j = 1; j < (n - i); j++) {
        if (my_array[j - 1] > my_array[j]) {
          //Code to swap the elements
          temp = my_array[j - 1];
          my_array[j - 1] = my_array[j];
          my_array[j] = temp;
   }}}}
  public static void main(String[] args) {
    int array[] = {4,15,12,21,2,25,10,18 };
    System.out.println("Array on which we apply Bubble Sort: ");
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");
    }
    System.out.println();
    bubbleAscending(array); //Applying Bubble sort to sort the Array  
    System.out.println("Array after applying Bubble Sort: ");
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");
    }}}