/**
 * Queue
 */
public class Queue {
  Node front, rear;

  class Node {
    String data;
    Node next;

    Node(String data) {
      this.data = data;
      this.next = null;
    }
  }

  boolean isEmpty() {
    return rear == null && front == null ? true : false;
  }

  void enqueueQueue(String data) {
    Node newNode = new Node(data);
    if (isEmpty()) {
      this.rear = this.front = newNode;
      return;
    } else {
      rear.next = newNode;
      rear = newNode;
    }
  }

  void dequeueQueue() {
    if (isEmpty()) {
      System.out.println("The queue is empty.");
      return;
    }
    front = front.next;
    if (front == null) {
      rear = null;
    }
  }

  String getFront() {
    if (isEmpty()) {
      String emptyMsg = "The queue is empty.";
      System.out.println(emptyMsg);
      return emptyMsg;
    } else {
      return front.data;
    }
  }

  String getRear() {
    if (isEmpty()) {
      String emptyMsg = "The queue is empty.";
      System.out.println(emptyMsg);
      return emptyMsg;
    } else {
      return rear.data;
    }
  }
}
