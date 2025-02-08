//public class LeetCode_83_RemoveDuplicateFromSortedList {
//    public static void main(String[] args) {
//
//    }
//    public static ListNode deleteDuplicates(ListNode head) {
//        if(head==null){
//            return head;
//        }
//        ListNode prev=head,current=head.next;
//        while(current!=null){
//            if(prev.val==current.val){
//                prev.next=current.next;
//                current=current.next;
//            }else{
//                prev=current;
//                current=current.next;
//            }
//        }
//        return
//}
