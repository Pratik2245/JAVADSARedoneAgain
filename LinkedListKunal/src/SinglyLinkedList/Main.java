package SinglyLinkedList;

public class Main {
    public static void main(String[] args) {
   LinkedList l=new LinkedList();
//   l.addStart(1);
//   l.addStart(2);
   l.addLast(1);
   l.addLast(2);
   l.addLast(3);
   l.addLast(4);
   l.addLast(5);
   l.displayLinkedList();
//   remove the nth element from the linked list
   System.out.println(l.removeNth(2));
//   System.out.println(l.size);
        l.displayLinkedList();
    }
}
