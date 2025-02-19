import java.util.Scanner;

import static java.lang.System.exit;

public class Stack2_LinkedListOperations {
    public static void main(String[] args) {
    int choice;
    StackLikedList s=new StackLikedList();
        Scanner sc=new Scanner(System.in);
    do{
        System.out.println("Press");
        System.out.println("1.Push");
        System.out.println("2.Pop");
        System.out.println("3.Peek");
        System.out.println("4.Display");
        System.out.println("5.Exit");
        System.out.println("Enter your choice=");
        choice=sc.nextInt();
        switch (choice){
            case 1:
                System.out.println("Enter data to insert In stack");
                int data=sc.nextInt();
                s.pushLinkedList(data);
                break;
            case 2:
                int result=s.popDataLinkedList();
                System.out.println(result+" from stack");
                break;
            case 3:
                int data1=s.peek();
                System.out.println(data1);
                break;
            case 4:
                s.displayLinkedList();
                break;
            case 5:
                exit(0);
                break;
            default:
                System.out.println("Enter a valid value from the given options");
                break;
        }


    }while (choice!=5);
    }
}
class StackLikedList{
    private Node head;
    public class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public void pushLinkedList(int data){
        Node node=new Node(data);
        if(head==null){
            head=node;
            return;
        }
        node.next=head;
        head=node;
    }
    public int popDataLinkedList(){
        if(head==null){
            System.out.println("Stack UnderFlow Error");
            return -1;
        }
        int top=head.data;
        head=head.next;
        return top;
    }
    public int peek(){
        if (head == null) {
            System.out.println("Stack is empty");
            return -1; // or throw an exception
        }
        return head.data;
    }
    public void displayLinkedList(){
        Node temp=head;
        if(temp==null){
            System.out.println("Linked List is empty");
            return;
        }
        while (temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }

    }
}
