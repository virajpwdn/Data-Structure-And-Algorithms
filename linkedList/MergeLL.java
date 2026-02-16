/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null)
            return null;
        // HashSet<ListNode> set = new HashSet<ListNode>();

        // ListNode tempHeadA = headA;
        // ListNode tempHeadB = headB;

        // while(tempHeadA != null) {
        //     set.add(tempHeadA);
        //     tempHeadA = tempHeadA.next;
        // }

        // while(tempHeadB != null) {
        //     if(set.contains(tempHeadB)) {
        //         return tempHeadB;
        //     }

        //     set.add(tempHeadB);
        //     tempHeadB = tempHeadB.next;
        // }

        // return null;

        // int p1 = 0, p2 = 0;
        // ListNode curr = headA;
        // while (curr != null) {
        //     p1++;
        //     curr = curr.next;
        // }

        // curr = headB;
        // while (curr != null) {
        //     p2++;
        //     curr = curr.next;
        // }

        // int diff = 0;
        // if (p1 > p2) {
        //     diff = p1 - p2;
        //     curr = headA;
        //     while (diff != 0) {
        //         diff--;
        //         curr = curr.next;
        //     }
        //     ListNode temp = headB;
        //     while (curr != null) {
        //         if (curr == temp) {
        //             return temp;
        //         }

        //         curr = curr.next;
        //         temp = temp.next;
        //     }
        // } else {
        //     diff = p2 - p1;
        //     curr = headB;
        //     while (diff != 0) {
        //         diff--;
        //         curr = curr.next;
        //     }
        //     ListNode temp = headA;
        //     while (curr != null) {
        //         if (curr == temp) {
        //             return temp;
        //         }

        //         curr = curr.next;
        //         temp = temp.next;
        //     }
        // }
        // return null;

        ListNode tempHeadA = headA, tempHeadB = headB;

        while (tempHeadA != tempHeadB) { 
            tempHeadA = (tempHeadA == null) ? headB : tempHeadA.next;
            tempHeadB = (tempHeadB == null) ? headA : tempHeadB.next;
        }

        return tempHeadA;
    }
}
