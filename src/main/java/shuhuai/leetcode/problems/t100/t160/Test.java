package shuhuai.leetcode.problems.t100.t160;

import shuhuai.leetcode.utils.ListHelper;

import java.util.Scanner;

public class Test {
    public void test() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        while (!input.isEmpty()) {
            int intersectVal = Integer.parseInt(input);
            input = sc.nextLine();
            String[] split = input.split(" ");
            ListNode listA;
            try {
                listA = new ListHelper<>(ListNode.class).build(split);
            } catch (Exception e) {
                continue;
            }
            input = sc.nextLine();
            split = input.split(" ");
            ListNode listB;
            try {
                listB = new ListHelper<>(ListNode.class).build(split);
            } catch (Exception e) {
                continue;
            }
            int skipA = sc.nextInt();
            int skipB = sc.nextInt();
            ListNode p = listA;
            while (skipA != 0) {
                p = p.next;
                skipA--;
            }
            ListNode q = listB;
            while (skipB != 1) {
                q = q.next;
                skipB--;
            }
            q.next = p;
            if (intersectVal != p.val) {
                continue;
            }
            ListNode result = new Solution().getIntersectionNodeSimple(listA, listB);
            System.out.println(result.val);
            result = new Solution().getIntersectionNodeClever(listA, listB);
            System.out.println(result.val);
            sc.nextLine();
            input = sc.nextLine();
        }
    }
}