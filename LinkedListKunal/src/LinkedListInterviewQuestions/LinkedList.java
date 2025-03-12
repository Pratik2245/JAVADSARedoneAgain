package LinkedListInterviewQuestions;

public class LinkedList {
    private Node head;
    private Node Tail;
    int size=0;
    class Node{
        Node next;
        int data;
        Node(int data){
            this.data=data;
            this.next=null;
        }
        Node(int data,Node node){
            this.data=data;
            this.next=node;
        }
    }

    void addStart(int data){
        Node  n=new Node(data);
        if(head==null){
            head=n;
            size++;
            return;//this was remaining to write so it was going in infinite loop
        }
        n.next=head;
        head=n;
        size++;
    }
    //inserting in linked list using recursion
    public void InsertRecursion(int data,int index){
        head=insertAtIndex(data,index,head);
    }
    public Node insertAtIndex(int data,int index,Node node) {
        if (index == 0) {
            Node newNode = new Node(data, node);
            return newNode;
        }
        node.next = insertAtIndex(data, index-1, node.next);
        return node;
    }
    void displayLinkedList(){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("NULL");
    }

    public boolean checkLinkedListPalindrome(){
       Node temp= findMid(head);
//       reverse the linked list from mid
        Node prev=null;
        Node current=temp;
        Node nextPtr;
        while (current!=null){
            nextPtr=current.next;
            current.next=prev;
            prev=current;
            current=nextPtr;
        }
        Node right=prev;//right side head
        Node left=head;
//        now iterate through the linked list
        while (right!=null){
            if(left.data!=right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return  true;
    }

    public Node findMid(Node head){
     Node slow=head;
     Node fast=head;
     while (fast!=null && fast.next!=null){
         slow=slow.next;
         fast=fast.next.next;
     }
     return  slow;
    }
//    public boolean hasCycle(ListNode head) {
//        ListNode fast=head;
//        ListNode slow=head;
//        while(fast!=null && fast.next!=null){
//            fast=fast.next.next;
//            slow=slow.next;
//            if(fast==slow){
//                ListNode temp=slow;
//               int length=0;
//                  do{
//                      temp=temp.next;
//                      length++;
//                    }while(temp!=slow);
//    return length;
//            }
//        }
//        return false;
//    }
}
