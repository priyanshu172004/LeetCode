class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null) return head;

        ListNode temp = head;
        int n = 1;
        while(temp.next != null){
            temp = temp.next;
            n++;
        }

        k = k % n;
        if(k == 0) return head;

        ListNode helper = temp; 
        helper.next = head;     

        ListNode tail = head;
        for(int i = 0; i < n - k - 1; i++){
            tail = tail.next;
        }

        ListNode newHead = tail.next;
        tail.next = null;

        return newHead;
    }
}