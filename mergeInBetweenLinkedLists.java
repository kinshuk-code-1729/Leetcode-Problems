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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode tmp = list1;
        ListNode A = null;  
        ListNode B = null;
        int i = 0;

        while(tmp != null){
            if(i == a - 1){
                A = tmp;
            }
            else if(i == b + 1){
                B = tmp;
            }
            tmp = tmp.next;
            i++;
        }

        A.next = list2;
        ListNode node = list2;
        while(node.next != null){
            node = node.next;
        }  
        node.next = B;
        return list1;
    }
}
