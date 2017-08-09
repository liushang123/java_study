package com.java.leetCode;

import java.util.List;

/**
 * Created by mi on 17-8-7.
 */
public class RemoveNode_19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode re = head;
        if (head == null) {
            return re;
        }
        int len = 1;
        ListNode pre = head;
        while (pre.next != null) {
            len++;
            pre = pre.next;
        }
        if (n == len) {
            return head.next;
        }
        pre = head;
        int  i = 1;
        while (pre.next != null) {

            if (i + n == len ) {
                ListNode del = pre.next;
                pre.next = del.next;
                break;
            }
            pre=pre.next;
            i++;
        }

        return re;
    }

    public ListNode removeNthFromEnd2(ListNode head, int n) {
        ListNode start = new ListNode(0);
        ListNode slow = start,fast = start;
        start.next = head;
        for(int i=1;i<n+1;i++) {
            fast = fast.next;
        }
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;

        return start.next;
    }
}

class ListNode{
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
