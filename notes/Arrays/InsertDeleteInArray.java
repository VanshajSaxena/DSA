/**
 * insertDeleteInArray
 */
public class InsertDeleteInArray {

  // `arr` is the array to which the element is to be added
  // `n` is the number of elements in the array
  // `key` being the actual value to be inserted
  // `capacity` is the allocated space in the array
  static int insertAtTheEnd(int arr[], int n, int key, int capacity) {
    if (n >= capacity) {
      return n;
    }
    arr[n] = key; // arr[n] represents the first empty space in the array
    return n + 1;
  }

  // `arr` is the array to which the element is to be added
  // `n` is the number of elements in the array
  // `key` being the actual value to be inserted
  // `pos` is the position at which the the key is to be inserted
  static void insertAtPosition(int arr[], int n, int key, int pos) {
    // NOTE: - This kind of insertion will delete the last element, and will replace
    // it with the second last element
    for (int i = n - 1; i >= pos; i--) {
      arr[i + 1] = arr[i];
    }
    arr[pos] = key;
  }

  // Simple linear search to find position of an element in the array
  static int findElement(int arr[], int n, int key) {
    int i;
    for (i = 0; i < arr.length; i++) {
      if (arr[i] == key) {
        return i;
      }
    }
    return -1;
  }

  // Method to delete an element in the array, the position is not known and only
  // the key to be deleted is known
  // `arr` is the array from which the element is to be deleted
  // `n` is the number of elements in the array
  // `key` being the actual value to be deleted
  static int deleteElement(int arr[], int n, int key) {
    int pos = findElement(arr, n, key);

    if (pos == -1) {
      System.out.println("Element not found...");
      return n;
    } else {
      for (int i = pos; i <= n; i++) {
        arr[i] = arr[i + 1];
      }
      return n - 1;
    }
  }

  public static void main(String[] args) {
    int arr[] = new int[10];
    arr[0] = 2;
    arr[1] = 8;
    arr[2] = 10;
    arr[3] = 12;
    arr[4] = 15;

    int capacity = 20;

    System.out.println("Adding element at the end of array...");
    int result = insertAtTheEnd(arr, 5, 99, capacity);
    for (int i = 0; i < arr.length; i++) {
      System.out.println("index: " + i + " value: " + arr[i]);
    }
    System.out.println();

    System.out.println("Length of array: " + arr.length);
    System.out.println("Number of elements after insertion: " + result + "\n");

    System.out.println("Adding element at the specified position...");
    insertAtPosition(arr, 5, 98, 2);
    for (int i = 0; i < arr.length; i++) {
      System.out.println("index: " + i + " value: " + arr[i]);
      if (i == arr.length - 1) {
        System.out.println();
      }
    }

    System.out.println("Deleting an element inside the array...");
    int arrayLengthAfterDeletion = deleteElement(arr, 6, 2);
    System.out.println("Number of elements after deletion: " + arrayLengthAfterDeletion + "\n");
    for (int i = 0; i < arr.length; i++) {
      System.out.println("index: " + i + " value: " + arr[i]);
      if (i == arr.length - 1) {
        System.out.println();
      }
    }
  }
}
