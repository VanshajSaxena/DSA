/**
 * SelectionSort
 */
public class SelectionSort {

  public static void main(String[] args) {
    int array[] = { 64, 25, 12, 22, 11 };

    selectionSort(array);

    System.out.println("Sorted Array:");
    for (int i : array) {
      System.out.print(i + " ");
    }
  }

  private static void selectionSort(int[] array) {
    for (int i = 0; i < array.length - 1; i++) {
      int min = i;
      for (int j = i + 1; j < array.length; j++) {
        if (array[min] > array[j]) {
          min = j;
        }
      }
      int temp = array[i];
      array[i] = array[min];
      array[min] = temp;
    }
  }
}
