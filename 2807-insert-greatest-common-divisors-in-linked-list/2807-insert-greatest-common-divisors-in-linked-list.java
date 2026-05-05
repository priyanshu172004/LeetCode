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
    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode dummy = new ListNode(0);
        ListNode helper = dummy;

        ListNode slow = head;
        ListNode fast = head.next;
        while(fast != null){
            helper.next = slow;
            int n1 = slow.val;
            int n2 = fast.val;
            ListNode node = new ListNode(gcd(n1, n2));

            slow.next = node;
            node.next = fast;
            helper = fast;
            slow = fast;
            fast = fast.next;
        }
        return dummy.next;
    }
}