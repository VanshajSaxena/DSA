import java.util.Stack;

/**
 * Stack
 */
public class Stacks {
  public static void main(String[] args) {
    Stack<String> stack = new Stack<String>();

    stack.push("newItem");
    stack.peek();
    String x = stack.pop();
    System.out.println(x); // newItem
    System.out.println(stack.isEmpty()); // true

  }
}
