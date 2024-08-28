package shuhuai.leetcode.problems.t645;

public class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] counter = new int[nums.length];
        for (int num : nums) {
            counter[num - 1]++;
        }
        int[] res = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (counter[i] > 1) {
                res[0] = i + 1;
            }
            if (counter[i] < 1) {
                res[1] = i + 1;
            }
        }
        return res;
    }
}