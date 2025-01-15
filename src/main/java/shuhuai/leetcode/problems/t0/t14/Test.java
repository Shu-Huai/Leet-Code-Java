package shuhuai.leetcode.problems.t0.t14;

import java.util.Scanner;

public class Test {
    public void test() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (!input.isEmpty()) {
            String[] arr = input.split(" ");
            System.out.println(new Solution().longestCommonPrefix(arr));
            input = scanner.nextLine();
        }
    }
}
