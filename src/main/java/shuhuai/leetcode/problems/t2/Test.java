package shuhuai.leetcode.problems.t2;

import shuhuai.leetcode.utils.ListHelper;
import shuhuai.leetcode.utils.Printer;

import java.util.Scanner;

public class Test {
    public void test() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        while (!input.isEmpty()) {
            String[] split = input.split(" ");
            ListNode list1;
            try {
                list1 = new ListHelper<>(ListNode.class).build(split);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            input = sc.nextLine();
            split = input.split(" ");
            ListNode list2;
            try {
                list2 = new ListHelper<>(ListNode.class).build(split);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            String[] result;
            try {
                result = new ListHelper<>(ListNode.class).deBuild(new Solution().addTwoNumbers(list1, list2));
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            new Printer<>().printArray(result);
            sc.nextLine();
            input = sc.nextLine();
        }
    }
}