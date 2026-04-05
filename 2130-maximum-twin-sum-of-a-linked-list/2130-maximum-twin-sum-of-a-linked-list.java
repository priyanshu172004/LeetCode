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
    public int pairSum(ListNode head){
        if(head == null){
            return -1;
        }
        int max = 0;
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode prev = null;
        ListNode curr = slow;
        ListNode next = null;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        ListNode l1 = prev;
        ListNode l2 = head;
        while(l1 != null && l2 != null){
            int a = l1.val;
            l1 = l1.next;
            int b = l2.val;
            l2 = l2.next;

            max = Math.max(max, a + b);
        }
        return max;
    }
}