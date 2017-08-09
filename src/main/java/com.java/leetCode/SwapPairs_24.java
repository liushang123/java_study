package com.java.leetCode;

/**
 * Created by mi on 17-8-8.
 */
public class SwapPairs_24 {
    public static ListNode swapPairs(ListNode head) {
        ListNode phead,pre,pnext;
        phead = new ListNode(0);
        phead.next = head;
        pre = phead;
        pnext = head.next;
        while (pnext != null) {
            pre.next = pnext;
            head.next = pnext.next;
            pnext.next = head;
            pre = head;
            if(head.next==null || head.next.next==null)
                break;
            head = head.next;
            pnext = head.next;

        }

        return phead.next;
    }

    public ListNode swapPairs2(ListNode head) {
        ListNode phead = new ListNode(0);
        ListNode pre = phead;
        pre.next = head;
        while (pre.next != null && pre.next.next != null) {
            ListNode first = pre.next;
            ListNode sco = pre.next.next;
            ListNode pnext = sco.next;
            pre.next = sco;
            sco.next = first;
            first.next = pnext;
            pre = pre.next.next;
        }
        return phead.next;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        ListNode head = swapPairs(n1);
        int a = 1;
    }
}
