/**
 * LinkedList
 */
public class LinkedList {
  Node head;

  class Node {
    String data;
    Node next;

    Node(String data) {
      this.data = data;
      this.next = null;
    }

  }

  LinkedList(String data) {
    Node head = new Node(data);
    this.head = head;
  }

  void printList() {
    Node n = this.head;
    while (n != null) {
      System.out.println(n.data + " ");
      n = n.next;
    }
  }

  public static void main(String[] args) {
    LinkedList myList = new LinkedList("A");
    myList.printList();
  }
}
