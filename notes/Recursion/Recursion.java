/**
 * Recursion
 */
public class Recursion {

  public static void main(String[] args) {

    walk(5);

    int factorial = factorial(7);
    System.out.println(factorial);

    int power = power(3, 9);
    System.out.println(power);
  }

  private static int power(int base, int exponent) {
    if (exponent < 1) {
      return 1;
    }
    return base * power(base, exponent - 1);
  }

  private static int factorial(int num) {
    if (num < 1) {
      return 1;
    }
    return num * factorial(num - 1);
  }

  private static void walk(int steps) {
    if (steps < 1) {
      return;
    }
    System.out.println("Took a step.");
    walk(steps - 1);
  }
}
