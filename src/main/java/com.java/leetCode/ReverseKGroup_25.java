package com.java.leetCode;

/**
 * Created by mi on 17-8-8.
 */
public class ReverseKGroup_25 {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode phead = new ListNode(0);
        ListNode pre = phead;
        phead.next = head;
        if (k > 1) {
            while (pre.next != null) {
                ListNode tmp = pre.next;
                int i=0;
                while (i <k && tmp != null) {
                    i++;
                    tmp = tmp.next;
                }
                if (i < k) {
                    break;
                }
                ListNode curr = pre.next;
                ListNode first = pre.next;
                ListNode sec = pre.next.next;
                ListNode pnext = sec.next;
                int j = k;
                while (j > 1) {
                    sec.next = first;
                    first = sec;
                    sec = pnext;
                    if (j > 2) {
                        pnext = pnext.next;
                    }
                    j--;
                }
                pre.next = first;
                curr.next = sec;
                pre = curr;
            }
        }

        return phead.next;
    }
}
