package shuhuai.leetcode.problems.t300.t392;

import java.util.Scanner;

public class Test {
    public void test() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (!input.isEmpty()) {
            String[] arr = input.split(" ");
            System.out.println(new Solution().isSubsequenceSimple(arr[0], arr[1]));
            System.out.println(new Solution().isSubsequenceDynamic(arr[0], arr[1]));
            input = scanner.nextLine();
        }
    }
}