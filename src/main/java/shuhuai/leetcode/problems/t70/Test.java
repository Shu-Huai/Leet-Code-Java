package shuhuai.leetcode.problems.t70;

import java.util.Scanner;

public class Test {
    public void test(){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        while (!input.isEmpty()) {
            int x = Integer.parseInt(input);
            Solution solution = new Solution();
            System.out.println(solution.climbStairsStupid(x));
            System.out.println(solution.climbStairsClever(x));
            input = sc.nextLine();
        }
    }
}