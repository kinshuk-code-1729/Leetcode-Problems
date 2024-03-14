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
    public ListNode removeZeroSumSublists(ListNode head) {
        Map<Integer, ListNode> map = new HashMap<>();
        ListNode tmp = new ListNode(0);
        tmp.next = head;
        int s = 0;
        for(ListNode node = tmp; node != null; node = node.next){
            s += node.val;
            map.put(s, node);
        }
        s = 0;
        for(ListNode node = tmp; node!= null; node = node.next){
            s += node.val;
            node.next = map.get(s).next;
        }
        return tmp.next;     
    }
}
