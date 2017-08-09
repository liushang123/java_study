package com.java.leetCode;

/**
 * Created by mi on 17-8-7.
 */
public class MergeTwoLists_21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head,pre;
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        if (l1.val <= l2.val) {
            head = l1;
            pre = l1;
            l1 = l1.next;
        } else {
            head = l2;
            pre = l2;
            l2 = l2.next;
        }
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                pre.next = l1;
                pre = l1;
                l1 = l1.next;
            } else {
                pre.next = l2;
                pre = l2;
                l2 = l2.next;
            }
        }
        while (l1 != null) {
            pre.next = l1;
            pre = l1;
            l1 = l1.next;
        }
        while (l2 != null) {
            pre.next = l2;
            pre = l2;
            l2 = l2.next;
        }

        return head;
    }
}
