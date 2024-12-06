package shuhuai.leetcode.problems.t274;

import shuhuai.leetcode.utils.Inputer;

import java.util.Scanner;

public class Test {
    public void test(){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        while (!input.isEmpty()){
            int[] nums = new Inputer().stringToIntArray(input);
            System.out.println(new Solution().hIndexStupid(nums));
            System.out.println(new Solution().hIndexBinary(nums));
            System.out.println(new Solution().hIndexCoutner(nums));
            System.out.println(new Solution().hIndexSort(nums));
            input = sc.nextLine();
        }
    }
}