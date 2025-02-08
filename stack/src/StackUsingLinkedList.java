public class StackUsingLinkedList {
    public static void main(String[] args) {
   Stack s=new Stack();
   s.push(45);
    }
}
class Node {
    Node next;
    int data;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class Stack{
    int top=1;
    Node head;
    Stack(){
        this.head=null;
    }
    boolean isEmpty(){
//        if(this.head==null){
//            System.out.println("Stack is empty");
//            return false;
//        }
        return  head==null;
    }

    public void push(int data){
        Node newNode=new Node(data);
        if(newNode==null){
            System.out.println("\nStack Overflow");
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return -1;
        }else{
            Node temp=head;
            temp=temp.next;
            head=temp;
            return temp.data;

        }
    }
}
