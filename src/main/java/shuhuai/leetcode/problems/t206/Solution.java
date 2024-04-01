package shuhuai.leetcode.problems.t206;


public class Solution {
    public ListNode reverseListLoop(ListNode head) {
        ListNode cur = head;
        ListNode pre = null;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }

    public ListNode reverseListRecursive(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode next = reverseListRecursive(head.next);
        head.next.next = head;
        head.next = null;
        return next;
    }
}
