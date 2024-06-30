class SearchArrays {
  static int searchArray(int arr[], int key) {
    for (int i = 0; i < arr.length; i++)
      if (arr[i] == key) {
        return i;
      }
    // return -1 if not found
    return -1;
  }

  public static void main(String[] args) {
    int myArray[] = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
    int result = searchArray(myArray, 9);
    System.out.println(result + 1); // 2
  }
}
