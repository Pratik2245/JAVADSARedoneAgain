package LinkedListInterviewQuestions;

import com.sun.security.jgss.GSSUtil;

import java.util.List;

public class DetectingCycleInLinkedList {
    public static ListNode tail;
    public static ListNode head;
    public static ListNode createCycleList() {

        head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(3);
        ListNode fifth = new ListNode(1);
//        tail=fifth;
//        ListNode fifth=new ListNode(5);
//        ListNode sixth=new ListNode(6);
//        ListNode seventh=new ListNode(7);
//        ListNode eighth=new ListNode(8);

        // Creating the linked list: 1 -> 2 -> 3 -> 4
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next=fifth;
        fifth.next=null;
//        fifth.next=sixth;
//        sixth.next=seventh;
//        seventh.next=eighth;
//        eighth.next=fourth;

        // Creating a cycle: 4 -> 2 (cycle starts at node with value 2)
//        fourth.next = second;

        return head; // Returning the head of the cycle list
    }
    public static boolean detectCycle(ListNode head){
     ListNode slow=head;
     ListNode fast=head;
     while (fast!=null && fast.next!=null){
         slow=slow.next;
         fast=fast.next.next;
         if(slow==fast){
             return true;
         }
     }
     return false;
    }
    //middle of linked list
    public static ListNode middleNode(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public static void removingCycle(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while (fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                break;
            }
        }
        if (fast == null || fast.next == null) {
            return;
        }
        slow=head;
        while (fast.next!=slow.next){
            slow=slow.next;
            fast=fast.next;
        }
        fast.next=null;
    }
    public static void displayLinkedList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }


    public static int calculateTheLengthOfCycle(ListNode head){
       ListNode slow=head;
       ListNode fast=head;
       while ( fast!=slow || (fast!=null && fast.next!=null)){
           slow=slow.next;
           fast=fast.next.next;

           if(fast==slow){
               int count = 1;
               slow = slow.next;

               // Count the length of the cycle
               while (slow !=fast) {
                   slow = slow.next;
                   count++;
               }
               return count;
           }
       }
        return 0;
    }

    public static  void startingPointCycle(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while (fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                fast=head;
                while (slow!=fast){
                    slow=slow.next;
                    fast=fast.next;
                }
                System.out.println(slow.val);
            }
        }
    }
//    using recursion reversing the linked list
    public static void reverseLinkedLIst(ListNode node){
        if(node==tail){
            head=tail;
            return;
        }
        reverseLinkedLIst(node.next);
        tail.next=node;
        tail=node;
        tail.next=null;
   
    }

    public static ListNode reverseBetween(ListNode head, int left, int right) {
            if(left==right){
                return head;
            }
            ListNode current=head;
            ListNode prev=null;
            for(int i=0;i<left-1;i++){
                prev=current;
                current=current.next;
            }
            ListNode last=prev;
            ListNode newend=current;
            ListNode next=current.next;
            for(int i=0;current!=null &&i< right-left+1;i++){
                current.next=prev;
                prev=current;
                current=next;
                if(next!=null){
                    next=next.next;
                }
            }
            // if we want to reverse from the start
            if(last!=null){
                last.next=prev;
            }else{
                head=prev;
            }
            newend.next=current;
            return head;
    }
    public boolean isPalindrome(ListNode head){
        ListNode mid=middleNode(head);
        System.out.println(mid);
        return true;
    }
    public static void reorderList(ListNode head) {
        ListNode mid=middleNode(head);
        ListNode slow=head;
        
    }
    public static ListNode reverseLinkedList(ListNode head){
       ListNode prev=null;
       ListNode current=head;

       while (current!=null){
           ListNode next=current.next;
           current.next=prev;
           prev=current;
           current=next;

       }
       return prev;
    }


    public static boolean palindromeLInkedList(ListNode head){
        ListNode mid=middleNode(head);
        ListNode headSecond=reverseLinkedList(mid);
        ListNode firsthalf=head;
        while(headSecond!=null)
        {
            if(firsthalf.val!=headSecond.val){
                return false;
            }
            firsthalf=firsthalf.next;
            headSecond=headSecond.next;
        }
        return  true;

    }

//    main method
    public static void main(String[] args) {
     ListNode head=createCycleList();
//     boolean ans=detectCycle(head);
//     System.out.println(ans);
//     removingCycle(head);
//     displayLinkedList(head);
//        detect the length of the cycle
//        int ans=calculateTheLengthOfCycle(head);
//        System.out.println(ans);
//        now calculate the startig point of the cycle
//        startingPointCycle(head);
//        reverseLinkedLIst(head);
        displayLinkedList(head);
//        reorderList(head);
//        displayLinkedList(head);
//        ListNode l=reverseBetween(head,2,4);
//        System.out.println(l.val);
//        ListNode head1=reverseLinkedList(head);
//        displayLinkedList(head1);
        boolean res=palindromeLInkedList(head);
        System.out.println(res);
    }

}

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}
