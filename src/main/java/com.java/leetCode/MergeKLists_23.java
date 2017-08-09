package com.java.leetCode;

/**
 * Created by mi on 17-8-7.
 */
public class MergeKLists_23 {
    public ListNode mergeKLists(ListNode[] lists) {
        int len = lists.length;
        if (lists == null || len == 0) {
            return null;
        }
        if (len == 1) {
            return lists[0];
        }
        while (len > 1) {
            int mid = (len+1)/2;
            for(int i =0; i<len/2;i++) {
                lists[i] = mergeTwoList(lists[i], lists[i + mid]);
            }
            len = mid;
        }
        return lists[0];
    }

    public ListNode mergeTwoList(ListNode l1, ListNode l2) {
        if(l1==null) return null;
        if(l2 == null) return null;
        ListNode head = new ListNode(0);
        ListNode phead = head;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                phead.next = l1;
                phead = l1;
                l1 = l1.next;
            } else {
                phead.next = l2;
                phead = l2;
                l2 = l2.next;
            }
        }
        if (l1 != null) {
            phead.next = l1;
        }
        if (l2 != null) {
            phead.next = l2;
        }
        return head.next;
    }
}
