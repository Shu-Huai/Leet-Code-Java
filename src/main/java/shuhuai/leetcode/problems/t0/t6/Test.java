package shuhuai.leetcode.problems.t0.t6;


import java.util.Scanner;

public class Test {
    public void test() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (!input.isEmpty()) {
            String s = input;
            input = scanner.nextLine();
            int numRows = Integer.parseInt(input);
            System.out.println(new Solution().convert(s, numRows));
            input = scanner.nextLine();
        }
    }
}