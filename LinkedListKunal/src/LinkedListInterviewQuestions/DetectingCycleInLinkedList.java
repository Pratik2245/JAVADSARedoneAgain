package LinkedListInterviewQuestions;

import com.sun.security.jgss.GSSUtil;

import java.util.List;

public class DetectingCycleInLinkedList {
    public static ListNode createCycleList() {
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
//        ListNode fifth=new ListNode(5);
//        ListNode sixth=new ListNode(6);
//        ListNode seventh=new ListNode(7);
//        ListNode eighth=new ListNode(8);

        // Creating the linked list: 1 -> 2 -> 3 -> 4
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next=second;
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
        startingPointCycle(head);
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
