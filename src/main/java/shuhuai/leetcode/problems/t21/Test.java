package shuhuai.leetcode.problems.t21;

import java.util.Scanner;

public class Test {
    public void test() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        while (!input.isEmpty()) {
            String[] split = input.split(" ");
            ListNode list1 = new ListNode(Integer.parseInt(split[0]));
            ListNode p = list1;
            for (int i = 1; i < split.length; i++) {
                p.next = new ListNode(Integer.parseInt(split[i]));
                p = p.next;
            }
            input = sc.nextLine();
            split = input.split(" ");
            ListNode list2 = new ListNode(Integer.parseInt(split[0]));
            p = list2;
            for (int i = 1; i < split.length; i++) {
                p.next = new ListNode(Integer.parseInt(split[i]));
                p = p.next;
            }
            ListNode result = new Solution().mergeTwoLists(list1, list2);
            while (result != null) {
                System.out.print(result.val + " ");
                result = result.next;
            }
            System.out.println();
            sc.nextLine();
            input = sc.nextLine();
        }
    }
}