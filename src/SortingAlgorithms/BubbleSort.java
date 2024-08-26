/**
 * BubbleSort
 */
public class BubbleSort {

  public static void main(String[] args) {
    int arr[] = { 1, 3, 5, 6, 6, 3, 72, 34, 73, 84, 23, 46, 32 };

    bubbleSort(arr);

    System.out.println("Sorted Array: ");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }

  }

  private static void bubbleSort(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = 0; j < arr.length - i - 1; j++) {
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
  }
}
