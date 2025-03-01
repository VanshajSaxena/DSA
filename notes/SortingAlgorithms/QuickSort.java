/**
 * QuickSort
 */
public class QuickSort {

  public static void main(String[] args) {
    int[] array = { 3, 5, 8, 9, 1, 0, 7, 6, 2, };

    quickSort(array, 0, array.length - 1);

    System.out.println("Sorted Array: ");
    for (int i : array) {

      System.out.println(i + " ");
    }

  }

  private static void quickSort(int[] array, int start, int end) {
    if (end <= start)
      return;

    int pivot = partition(array, start, end);
    quickSort(array, start, pivot - 1);
    quickSort(array, pivot + 1, end);

  }

  private static int partition(int[] array, int start, int end) {

    int pivot = array[end];
    int i = start - 1;

    for (int j = start; j < end; j++) {
      if (array[j] < pivot) {
        i++;
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
      }
    }

    i++;
    int temp = array[i];
    array[i] = array[end];
    array[end] = temp;

    return i;
  }
}
