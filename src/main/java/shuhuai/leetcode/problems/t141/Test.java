package shuhuai.leetcode.problems.t141;

import java.util.Scanner;

public class Test {
    public void test() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        while (!input.isEmpty()) {
            String[] split = input.split(" ");
            int[] nums = new int[split.length];
            for (int i = 0; i < split.length; i++) {
                nums[i] = Integer.parseInt(split[i]);
            }
            ListNode head = new ListNode(nums[0]);
            ListNode p = head;
            for (int i = 1; i < nums.length; i++) {
                p.next = new ListNode(nums[i]);
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