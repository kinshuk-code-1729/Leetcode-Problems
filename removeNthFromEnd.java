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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode tmp = new ListNode(0);
        tmp.next = head;
        
        ListNode pntr1 = tmp;
        ListNode pntr2 = tmp;

        for(int i = 1; i <= n + 1; i++){
            pntr2 = pntr2.next;
        }

        while(pntr2 != null){
            pntr1 = pntr1.next;
            pntr2 = pntr2.next;
        }

        ListNode k = pntr1.next;
        pntr1.next = pntr1.next.next;
        k.next = null;

        return tmp.next;    
    }
}

