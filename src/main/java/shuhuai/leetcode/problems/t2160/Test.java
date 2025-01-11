package shuhuai.leetcode.problems.t2160;

import java.util.Scanner;

public class Test {
    public void test() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (!input.isEmpty()) {
            int num = Integer.parseInt(input);
            System.out.println(new Solution().minimumSum(num));
            input = scanner.nextLine();
        }
    }
}