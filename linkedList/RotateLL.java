class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null) return head;
        ListNode temp = head;
        int length = 0;
        while(temp != null) {
            length++;
            temp = temp.next;
        }

        int stop = k % length;

        ListNode s = head;
        ListNode f = head;

        for(int i = 0 ; i < stop; i++) {
            f = f.next;
        }

        while(f.next != null) {
            s = s.next;
            f = f.next;
        }

        f.next = head;
        ListNode newHead = s.next;
        s.next = null;

        return newHead;
    }
}
