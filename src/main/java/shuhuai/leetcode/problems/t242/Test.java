package shuhuai.leetcode.problems.t242;

import java.util.Scanner;

public class Test {
    public void test() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        while (!input.isEmpty()) {
            String[] str = input.split(" ");
            System.out.println(new Solution().isAnagramMap(str[0], str[1]));
            System.out.println(new Solution().isAnagramSort(str[0], str[1]));
            input = sc.nextLine();
        }
    }
}