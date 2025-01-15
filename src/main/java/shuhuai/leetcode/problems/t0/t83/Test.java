package shuhuai.leetcode.problems.t0.t83;

import shuhuai.leetcode.utils.ListHelper;
import shuhuai.leetcode.utils.Printer;

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
                throw new RuntimeException(e);
            }
            head = new Solution().deleteDuplicates(head);
            try {
                split = new ListHelper<>(ListNode.class).deBuild(head);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            new Printer<>().printArray(split);
            input = sc.nextLine();
        }
    }
}