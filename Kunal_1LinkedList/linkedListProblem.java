public class linkedListProblem {
  Node head, tail;

  // merge 2 sorted linked list leetcode
  public linkedListProblem Merge(linkedListProblem list1, linkedListProblem list2) {
    Node f = list1.head;
    Node s = list2.head;
    linkedListProblem l3 = new linkedListProblem();
    Node dummy = new Node(0);
    Node current = dummy;
    while (f != null && s != null) {
      if (f.data < s.data) {
        current.next = f;
        f = f.next;
      } else {
        current.next = s;
        s = s.next;
      }
      current = current.next;
    }
    while (f != null) {
      current.next = f;
      f = f.next;
      current = current.next;
    }

    while (s != null) {
      current.next = s;
      s = s.next;
      current = current.next;
    }
    l3.head = dummy.next;
    return l3;
  }

  // ? inserting in
  // ?the linked list

  public void insert(int data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = newNode;
    } else {
      Node temp = head;
      while (temp.next != null) {
        temp = temp.next;
      }
      temp.next = newNode;
    }
  }

  // ? display the linked list
  public void display() {
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + " -> ");
      temp = temp.next;
    }
    System.out.println("null");
  }

  public void insertRecursion(int value, int index) {
    head = insertUsingRecursion(head, value, index);
    System.out.println(head.data);
  }

  // ? inserting using recursion
  public Node insertUsingRecursion(Node head, int value, int index) {
    if (index == 0) {
      Node node = new Node(value);
      node.next = head;
      return node;
    }
    head.next = insertUsingRecursion(head.next, value, index - 1);
    System.out.println(head.data);
    return head;
  }

  class Node {
    private int data;
    private Node next;

    Node(int data) {
      this.data = data;
    }

    Node(int data, Node next) {
      this.data = data;
      this.next = next;
    }
  }

  public static void main(String[] args) {
    linkedListProblem l1 = new linkedListProblem();
    linkedListProblem l2 = new linkedListProblem();
    // Populate the lists
    l1.insert(1);
    l1.insert(3);
    l1.insert(5);

    l2.insert(2);
    l2.insert(4);
    l2.insert(6);

    System.out.println("List 1:");
    l1.display();

    System.out.println("List 2:");
    l2.display();

    linkedListProblem l3 = l1.Merge(l1, l2);
    l3.display();

    l3.insertRecursion(1110, 3);
    l3.display();
  }
}
