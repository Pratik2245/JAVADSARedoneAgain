package SinglyLinkedList;

public class LinkedList {
    class Node{
        int data;
        Node next;
        Node(int data){
         this.data=data;
         this.next=null;
        }
    }
    private Node head;
    private Node tail;
    int size=0;
//    adding element in the start of the linked list
    void addStart(int data){
        Node n=new Node(data);
        if(head==null){
            head=n;
            tail=n;
            size++;
            return;//this was remaining to write so it was going in infinite loop
        }
        n.next=head;
        head=n;
        size++;
    }
//    adding element at the end of the linked list
    void addLast(int data){
       Node newNode=new Node(data);
       if(head==null){
           head=newNode;
           tail=newNode;
       }else{
       Node temp=head;
       while (temp.next!=null){
           temp=temp.next;
       }
           temp.next=newNode;
           newNode.data=data;
           tail=newNode;
       }

       size++;
    }
    
    void displayLinkedList(){
        Node temp=head;
        while (temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
//    public Node removeNth(int n){
//        if(head==null)
//        {
//            return null;
//        }
//        Node temp=head;
//        int count=0;
//        while (temp!=null){
//            count++;
//            temp=temp.next;
//        }
//        System.out.println("count"+count);
//        if(n==count){
//            head=head.next;
//            return head;
//        }
//        temp=head;
//
//        for (int i = 1; i <count-n ; i++) {
//            temp=temp.next;
//        }
//        temp.next=temp.next.next;
//        return head;
//    }
public Node removeNth(int n) {
    Node dummy = new Node(0);  // Dummy node to handle edge cases
    dummy.next = head;
    Node fast = dummy, slow = dummy;

    // Move fast pointer `n+1` steps ahead to maintain a gap
    for (int i = 0; i <= n; i++) {
        fast = fast.next;
    }
    System.out.println("fast="+fast.data);
    // Move both fast and slow pointers until fast reaches the end
    while (fast != null) {
        fast = fast.next;
        slow = slow.next;
    }

    // Remove the nth node from the end
    slow.next = slow.next.next;
//    we are returning dummy.next instead of head because when we have to delete head then it happens
    return dummy.next;
}
}
