package shuhuai.leetcode.problems.t400.t492;

import java.util.Scanner;

public class Test {
    public void test() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        while (!input.isEmpty()) {
            int[] result = new Solution().constructRectangle(Integer.parseInt(input));
            System.out.println(result[0] + " " + result[1]);
            input = sc.nextLine();
        }
    }
}