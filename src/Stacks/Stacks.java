import java.util.Stack;

/**
 * Stack
 */
public class Stacks {
  public static void main(String[] args) {
    Stack<String> stack = new Stack<String>();

    stack.push("newItem");
    System.out.println(stack.isEmpty());
  }
}
