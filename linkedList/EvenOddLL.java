class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode slow = head;
        ListNode fast = head.next;

        ListNode temp = fast;
        while(fast != null && fast.next != null) {
            slow.next = slow.next.next;
            fast.next = fast.next.next;

            slow = slow.next;
            fast = fast.next;
        }

        slow.next = temp;

        return head;
    }
}
