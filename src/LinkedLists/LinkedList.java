/**
 * LinkedList
 */
public class LinkedList {
  static class Node {
    int data;
    Node next;

    Node(int data) {
      this.data = data;
      this.next = null;
    }

  }

  private Node head = null;

  LinkedList(Node head) {
    this.head = head;
  }

  LinkedList() {
  }

  void printLinkedList() {
    Node current = head;
    while (current != null) {
      System.out.println(current.data);
      current = current.next;
    }
  }

  public static void main(String[] args) {
    LinkedList myList = new LinkedList();
    myList.printLinkedList();
  }
}
