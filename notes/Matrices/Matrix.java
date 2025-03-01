/**
 * Matrix
 */
public class Matrix {

  int arr[][] = new int[3][3];

  public static void main(String[] args) {
    Matrix matrix = new Matrix();
    matrix.arr = new int[][] {
        { 1, 2, 3 },
        { 4, 5, 6 },
        { 7, 8, 9 }
    };
    for (int i = 0; i < matrix.arr.length; i++) {
      for (int j = 0; j < matrix.arr[i].length; j++) {
        System.out.println(matrix.arr[i][j]);
      }
      System.out.println();
    }
  }
}
