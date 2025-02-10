package LinkedListInterviewQuestions;

import org.w3c.dom.Node;

public class Link1_RecursiveLInkedListInsertion {
    public static void main(String[] args) {
     LinkedList l=new LinkedList();
     Node head=null;
     l.addStart(35);
     l.addStart(100);
     l.addStart(200);
     l.InsertRecursion(34,3);

     l.displayLinkedList();
    }
}
