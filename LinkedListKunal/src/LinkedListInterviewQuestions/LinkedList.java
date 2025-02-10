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
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}
