package shuhuai.leetcode.problems.t21;

public class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result = new ListNode();
        ListNode p = result;
        ListNode q = list1;
        ListNode r = list2;
        while (q != null && r != null) {
            if (q.val < r.val) {
                p.next = q;
                q = q.next;
            } else {
                p.next = r;
                r = r.next;
            }
            p = p.next;
        }
        while (q != null) {
            p.next = q;
            q = q.next;
            p = p.next;
        }
        while (r != null) {
            p.next = r;
            r = r.next;
            p = p.next;
        }
        return result.next;
    }
}