public class LL2_DoublyLInkedList {
  private Node head, tail;
  int size;

  LL2_DoublyLInkedList() {
    this.size = 0;
  }

  // inserting element in the start of the linked list
  public void insertAtStart(int data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = tail = newNode;
      return;
    }
    newNode.next = head;
    head.prev = newNode;
    newNode.prev = null;
    head = newNode;
    size += 1;
  }

  // inserting element in the end of the linked list
  public void insertAtEnd(int data) {
    Node newNode = new Node(data);
    if (tail == null) {
      head = tail = newNode;
      return;
    }
    tail.next = newNode;
    // newNode.prev = tail;//is already set to null by default no need to do the
    // above code
    newNode.next = null;
    tail = newNode;

    size += 1;
  }

  // inserting at an index position of an linked list
  public void insertAtIndex(int data, int index) {
    if (index < 0 || index > size) {
      throw new IndexOutOfBoundsException("Invalid index: " + index);
    }

    Node node = new Node(data);

    if (index == 0) { // Insert at the beginning
      insertAtStart(data);
    } else if (index == size) { // Insert at the end
      insertAtEnd(data);
    } else { // Insert in the middle
      Node temp = head;
      for (int i = 0; i < index - 1; i++) {
        temp = temp.next;
      }

      // Update pointers to insert the node
      node.next = temp.next;
      temp.next.prev = node;
      temp.next = node;
      node.prev = temp;

      size++;
    }
  }

  // isnerting an element after an element in the linked list
  public void insertAfterAnElement(int node, int element) {
    Node newNode = new Node(node);
    Node temp = head;
    while (temp != null && temp.data != element) {
      temp = temp.next;
    }
    if (temp == null) {
      throw new RuntimeException("Element not found");
    }
    newNode.next = temp.next;
    newNode.prev = temp;
    if (temp.next != null) {
      temp.next.prev = newNode;
    } else {
      tail = newNode;
    }
    temp.next = newNode;
    size++;
  }

  // traversing the doubly linked list in java
  public void traverse() {
    if (head == null) {
      System.out.println("List is empty");
      return;
    }
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + " -> ");
      temp = temp.next;
    }
    System.out.print("NULL");
  }

  // \end{code}
  private class Node {
    int data;
    Node next, prev;

    public Node(int data) {
      this.data = data;
      this.next = null;
      this.prev = null;
    }
  }

  public static void main(String[] args) {
    LL2_DoublyLInkedList l = new LL2_DoublyLInkedList();
    // l.traverse();// prints null
    l.insertAtStart(990);
    // l.traverse();// prints 990
    l.insertAtEnd(50);
    l.insertAfterAnElement(666, 990);
    l.traverse();
  }
}
