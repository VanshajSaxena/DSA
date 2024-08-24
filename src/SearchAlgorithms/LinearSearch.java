/**
 * LinearSearch
 */
public class LinearSearch {
  public static void main(String[] args) {
    int[] array = { 2, 3, 5, 3, 8, 9, 2 };
    int index = linearSearch(array, 3);

    if (index != -1) {
      System.out.println("Element found at index: " + index);
    } else {
      System.out.println("Element not found");
    }

  }

  static int linearSearch(int[] array, int value) {
    for (int i = 0; i < array.length; i++) {
      if (array[i] == value) {
        return i;
      }
    }
    return -1;
  }
}
