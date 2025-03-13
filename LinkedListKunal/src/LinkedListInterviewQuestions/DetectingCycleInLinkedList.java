package LinkedListInterviewQuestions;

import com.sun.security.jgss.GSSUtil;

import java.util.List;

public class DetectingCycleInLinkedList {
    public static ListNode createCycleList() {
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);

        // Creating the linked list: 1 -> 2 -> 3 -> 4
        head.next = second;
        second.next = third;
        third.next = fourth;

        // Creating a cycle: 4 -> 2 (cycle starts at node with value 2)
        fourth.next = second;

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

    public static void main(String[] args) {
     ListNode head=createCycleList();
     boolean ans=detectCycle(head);
     System.out.println(ans);
     removingCycle(head);
     displayLinkedList(head);
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
