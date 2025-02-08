public class LL_1Operations {
  private Node head, tail;
  private int size;

  LL_1Operations() {
    this.size = 0;
  }

  // insertion of element at start of linked list
  public void insertionAtBeginning(int data) {
    Node newNode = new Node(data);
    size += 1;
    if (head == null) {
      head = tail = newNode;
    } else {
      newNode.next = head;
      head = newNode;
    }
  }

  // inserting ar the end of the linked list
  public void insertAtEnd(int data) {

    if (tail == null) {
      insertionAtBeginning(data);
    } else {
      Node newNode = new Node(data);
      size++;
      tail.next = newNode;
      newNode.next = null;
      tail = newNode;
    }
  }

  public void insertingAtAnIndex(int data, int index) {
    if (index < 0 || index > size) {
      throw new IndexOutOfBoundsException("Invalid index: " + index);
    }

    if (index == 0) {
      insertionAtBeginning(data);
    } else if (index == size) {
      insertAtEnd(data);
    } else {
      Node node = new Node(data);
      Node temp = head;
      for (int i = 0; i < index - 1; i++) {
        temp = temp.next;
      }
      size++;
      node.next = temp.next;
      temp.next = node;

    }
  }

  // deletion operation in the linked list
  public int deleteAtBeginning() {
    int value = 0;
    if (head == null) {
      System.out.println("list is empty");
    } else {
      value = head.data;
      head = head.next;
      size--;
      if (head == null) {
        tail = null;
      }
    }
    return value;
  }

  // deleting at the end of the linked list
  public int deleteAtEnd() {
    if (size == 0) {
      throw new IllegalStateException("Cannot delete from an empty list.");
    }
    if (size == 1) {
      return deleteAtBeginning();
    }
    Node secondLast = get(size - 2); // Get the second-to-last node
    int val = tail.data;
    secondLast.next = null;
    tail = secondLast; // Update tail
    size--;
    return val;
  }

  public Node get(int index) {
    if (index < 0 || index >= size) {
      throw new IndexOutOfBoundsException("Invalid index: " + index + ". Size: " + size);
    }
    Node node = head;
    for (int i = 0; i < index; i++) { // Stop at index
      node = node.next;
    }
    return node;
  }

  // deleting an element from an specific index position
  public int deletingFromIndex(int index) {
    if (index < 0 || index >= size) {
      throw new IndexOutOfBoundsException("Invalid index: " + index + ". Size: " + size);
    }
    if (index == 0) {
      return deleteAtBeginning();
    }
    if (index == size - 1) {
      return deleteAtEnd();
    }
    Node prev = get(index - 1);
    int val = prev.next.data;
    prev.next = prev.next.next; // Skip the node to be deleted
    size--;
    return val;
  }

  // traversal of the linked list
  public void traversal() {
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + "->");
      temp = temp.next;
    }
    System.out.print("NULL");

  }

  // inserting in a linked list using recursion
  public void insertUsingRecursion(int value, int index) {
    head = insertRec(value, index, head);
    System.out.println(head.data);
  }

  private Node insertRec(int value, int index, Node node) {
    if (index == 0) {
      Node temp = new Node(value);
      temp.next = node;
      size++;
      return temp; // Return the newly created node
    }
    node.next = insertRec(value, index - 1, node.next); // Use index - 1
    return node; // Return the current node to maintain the chain
  }

  class Node {
    private Node next;
    private int data;

    Node(int data) {
      this.data = data;
    }

    Node(int data, Node next) {
      this.data = data;
      this.next = next;
    }
  }

  public static void main(String[] args) {
    LL_1Operations l = new LL_1Operations();
    // l.insertionAtBeginning(12);
    // l.insertionAtBeginning(13);
    // l.insertionAtBeginning(14);
    // l.insertionAtBeginning(15);
    // l.traversal();
    // size of the linked list
    // System.out.println(l.size);

    // now we will insert at the end of the linked list
    // l.insertAtEnd(60);

    // inserting at an index in a linked list
    // l.insertingAtAnIndex(99, 4);

    // ?deletion operation on the linked list
    // System.out.println("deleted element is=" + l.deleteAtBeginning());// delete
    // the first node of the linked list
    // ? deleting node from the last of the linked list
    // System.out.println("item deleted from the last of the linked list =" +
    // l.deleteAtEnd());

    // deleting an element from the index of the linked list
    // System.out.println(l.deletingFromIndex(3));
    // l.insertUsingRecursion(299, 2);
    l.traversal();
  }
}