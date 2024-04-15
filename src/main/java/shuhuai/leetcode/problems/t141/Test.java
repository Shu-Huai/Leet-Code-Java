package shuhuai.leetcode.problems.t141;

import shuhuai.leetcode.utils.ListHelper;

import java.util.Scanner;

public class Test {
    public void test() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        while (!input.isEmpty()) {
            String[] split = input.split(" ");
            ListNode head;
            try {
                head = new ListHelper<>(ListNode.class).build(split);
            } catch (Exception e) {
                continue;
            }
            ListNode p = head;
            while (p != null && p.next != null) {
                p = p.next;
            }
            int pos = sc.nextInt();
            if (pos >= 0) {
                ListNode temp = head;
                for (int i = 0; i < pos; i++) {
                    temp = temp.next;
                }
                p.next = temp;
            }
            Solution solution = new Solution();
            System.out.println(solution.hasCycleSimple(head));
            System.out.println(solution.hasCycleClever(head));
            sc.nextLine();
            input = sc.nextLine();
        }
    }
}