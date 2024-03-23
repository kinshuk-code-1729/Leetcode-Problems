/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null){
            return true;
        }

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode head1 = head;
        ListNode head2 = reverseList(slow);

        while(head2 != null && head1 != null){
            if(head1.val == head2.val){
                head1 = head1.next;
                head2 = head2.next;
            }
            else{
                return false;
            }
        }
        return true;
    }

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;     
        ListNode cur = head;     
        ListNode next = null;

        while(cur != null){
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }

        head = prev;

        return head;     
    }
}
