package shuhuai.leetcode.problems.t15;

import shuhuai.leetcode.utils.Inputer;

import java.util.List;
import java.util.Scanner;

public class Test {
    public void test(){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (!input.isEmpty()){
            int[] nums = new Inputer().stringToIntArray(input);
            List<List<Integer>> result = new Solution().threeSum(nums);
            for (List<Integer> list : result) {
                for (Integer integer : list) {
                    System.out.print(integer);
                    System.out.print(" ");
                }
                System.out.println();
            }
            input = scanner.nextLine();
        }
    }
}