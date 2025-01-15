package shuhuai.leetcode.problems.t100.t138;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public Node copyRandomList(Node head) {
        Node result = new Node(0);
        Node p = result;
        Node q = head;
        Map<Node, Node> map = new HashMap<>();
        while (q != null) {
            p.next = new Node(q.val);
            map.put(q, p.next);
            p = p.next;
            q = q.next;
        }
        p = result.next;
        q = head;
        while (q != null) {
            p.random = map.get(q.random);
            p = p.next;
            q = q.next;
        }
        return result.next;
    }

    public Node copyRandomListClever(Node head) {
        Node p = head;
        while (p != null) {
            Node q = new Node(p.val);
            q.next = p.next;
            p.next = q;
            p = q.next;
        }
        p = head;
        while (p != null) {
            p.next.random = p.random != null ? p.random.next : null;
            p = p.next.next;
        }
        p = head;
        Node result = new Node(0);
        Node q = result;
        while (p != null) {
            q.next = p.next;
            q = q.next;
            p.next = p.next.next;
            p = p.next;
        }
        return result.next;
    }
}