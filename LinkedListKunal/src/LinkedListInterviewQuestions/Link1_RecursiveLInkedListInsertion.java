package LinkedListInterviewQuestions;

import org.w3c.dom.Node;

public class Link1_RecursiveLInkedListInsertion {
    public static void main(String[] args) {
     LinkedList l=new LinkedList();
     Node head=null;
     l.addStart(1);
     l.addStart(2);
     l.addStart(2);
     l.addStart(1);

     l.displayLinkedList();

     boolean b=l.checkLinkedListPalindrome();
        System.out.println(b);
    }
}
