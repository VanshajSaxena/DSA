/**
 * MergeSort
 */
public class MergeSort {

  public static void main(String[] args) {

    int[] array = { 2, 8, 7, 6, 4, 9, 0, 1, 3 };

    mergeSort(array);

    System.out.println("Sorted Array: ");
    for (int i : array) {
      System.out.print(i + " ");
    }
  }

  private static void mergeSort(int[] array) {
    int length = array.length;
    if (length <= 1) {
      return;
    }
    int middle = length / 2;
    int[] leftArray = new int[middle];
    int[] rightArray = new int[length - middle];

    int i = 0; // for leftArray
    int j = 0; // for rightArray

    for (; i < length; i++) {
      if (i < middle) {
        leftArray[i] = array[i];
      } else {
        rightArray[j] = array[i];
        j++;
      }
    }

    // System.arraycopy(array, 0, leftArray, 0, middle); // better performance, same
    // result
    // System.arraycopy(array, middle, rightArray, 0, length - middle); // ..

    mergeSort(leftArray);
    mergeSort(rightArray);
    merge(leftArray, rightArray, array);
  }

  private static void merge(int[] leftArray, int[] rightArray, int[] array) {
    int leftSize = array.length / 2;
    int rightSize = array.length - leftSize;
    int i = 0, l = 0, r = 0; // indiceis

    while (l < leftSize && r < rightSize) {
      if (leftArray[l] < rightArray[r]) {
        array[i++] = leftArray[l++];
      } else {
        array[i++] = rightArray[r++];
      }
    }

    while (l < leftSize) {
      array[i++] = leftArray[l++];
    }

    while (r < rightSize) {
      array[i++] = rightArray[r++];
    }
  }
}
