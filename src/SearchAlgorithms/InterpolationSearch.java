/**
 * InterpolationSearch
 */
public class InterpolationSearch {

  public static void main(String[] args) {
    int[] array = { 2, 8, 28, 52, 89, 144, 259, 800, 2999, 9999 };

    int index = interpolationSearch(array, 800);

    if (index == -1) {
      System.out.println("Element not found.");
    } else {
      System.out.println("Element found at index: " + index);
    }
  }

  private static int interpolationSearch(int[] array, int value) {
    int low = 0;
    int high = array.length - 1;

    while (value <= array[high] && array[low] <= value && low <= high) {
      int probe = low + (high - low) * (value - array[low]) / (array[high] - array[low]);
      System.out.println("probe: " + probe);

      if (array[probe] == value) {
        return probe;
      } else if (value < array[probe]) {
        high = probe - 1;
      } else {
        low = probe + 1;
      }
    }
    return -1;
  }
}
