package shuhuai.leetcode.problems.t0.t2;

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        ListNode p = result;
        int carry = 0;
        while (l1 != null && l2 != null) {
            p.next = new ListNode();
            p.next.val = (l1.val + l2.val + carry) % 10;
            carry = (l1.val + l2.val + carry) / 10;
            l1 = l1.next;
            l2 = l2.next;
            p = p.next;
        }
        while (l1 != null) {
            p.next = new ListNode();
            p.next.val = (l1.val + carry) % 10;
            carry = (l1.val + carry) / 10;
            l1 = l1.next;
            p = p.next;
        }
        while (l2 != null) {
            p.next = new ListNode();
            p.next.val = (l2.val + carry) % 10;
            carry = (l2.val + carry) / 10;
            l2 = l2.next;
            p = p.next;
        }
        if (carry != 0) {
            p.next = new ListNode();
            p.next.val = carry;
        }
        return result.next;
    }
}