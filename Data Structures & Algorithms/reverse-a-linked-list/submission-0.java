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
    public ListNode reverseList(ListNode head) {
        if(Objects.isNull(head)) return head;

        ListNode curr = head;
        ListNode prev = null;

        while(Objects.nonNull(curr)){
            ListNode temp = curr;
            curr = curr.next;

            temp.next = prev;
            prev = temp;
        }

        return prev;
    }
}
