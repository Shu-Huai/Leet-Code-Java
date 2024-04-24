package shuhuai.leetcode.problems.t118;

import java.util.List;
import java.util.Scanner;

public class Test {
    public void test() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        while (!input.isEmpty()) {
            int numRows = Integer.parseInt(input);
            List<List<Integer>> result = new Solution().generate(numRows);
            for (List<Integer> integers : result) {
                for (Integer integer : integers) {
                    System.out.print(integer + " ");
                }
                System.out.println();
            }
            input = sc.nextLine();
        }
    }
}