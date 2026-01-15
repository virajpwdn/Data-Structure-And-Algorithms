class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode();
    dummy.next = head;
    ListNode p = dummy;
    ListNode c = head;
    
    while (c != null && c.next != null) {
        ListNode n = c.next;
        
        p.next = n;
        c.next = n.next;
        n.next = c;
        
        p = c;
        c = c.next;
    }
    
    return dummy.next;
        
    }
}
