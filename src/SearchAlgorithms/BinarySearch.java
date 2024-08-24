// import java.util.Arrays;

/**
 * BinarySearch
 */
public class BinarySearch {
  public static void main(String[] args) {
    int array[] = new int[10000000];
    int target = 12489;

    for (int i = 0; i < array.length; i++) {
      array[i] = i;
    }

    // int index = Arrays.binarySearch(array, target);
    int index = binarySearch(array, target);
    if (index == -1) {
      System.out.println(target + "not found");
    } else {
      System.out.println("Element found at index: " + index);
    }
  }

  private static int binarySearch(int[] array, int target) {
    int low = 0;
    int high = array.length - 1;
    int counter = 0;

    while (low <= high) {
      int middle = (high + low) / 2;
      int value = array[middle];

      System.out.println(++counter);
      if (value < target) {
        low = middle + 1;
      } else if (value > target) {
        high = middle - 1;
      } else {
        return middle;
      }
    }
    return -1;
  }
}
