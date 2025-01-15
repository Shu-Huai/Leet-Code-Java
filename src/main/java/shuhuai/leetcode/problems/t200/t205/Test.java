package shuhuai.leetcode.problems.t200.t205;

import java.util.Scanner;

public class Test {
    public void test() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        while (!input.isEmpty()) {
            String[] arr = input.split(" ");
            System.out.println(new Solution().isIsomorphic(arr[0], arr[1]));
            input = sc.nextLine();
        }
    }
}