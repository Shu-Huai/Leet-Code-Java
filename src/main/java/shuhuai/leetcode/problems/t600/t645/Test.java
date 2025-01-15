package shuhuai.leetcode.problems.t600.t645;


import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public void test() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        while (!input.isEmpty()) {
            String[] str = input.split(" ");
            int[] nums = new int[str.length];
            for (int i = 0; i < str.length; i++) {
                nums[i] = Integer.parseInt(str[i]);
            }
            System.out.println(Arrays.toString(new Solution().findErrorNums(nums)));
            input = sc.nextLine();
        }
    }
}