/**
 * InsertionSort
 */
public class InsertionSort {

  public static void main(String[] args) {
    int[] array = { 9, 8, 4, 3, 7, 6, 5, 0, 1, 2 };

    insertionSort(array);

    System.out.println();
    for (int i : array) {
      System.out.print(i + " ");
    }
  }

  private static void insertionSort(int[] array) {
    for (int i = 1; i < array.length; i++) {
      int temp = array[i];
      int j = i - 1;

      while (j >= 0 && array[j] > temp) {
        array[j + 1] = array[j];
        j--;
      }

      array[j + 1] = temp;
    }
  }
}
