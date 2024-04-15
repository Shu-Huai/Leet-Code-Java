package shuhuai.leetcode.problems.t141;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean hasCycleSimple(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        ListNode p = head;
        while (p != null) {
            if (set.contains(p)) {
                return true;
            }
            set.add(p);
            p = p.next;
        }
        return false;
    }

    public boolean hasCycleClever(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
}
