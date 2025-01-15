package shuhuai.leetcode.problems.t100.t136;

public class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int elem : nums) {
            result ^= elem;
        }
        return result;
    }
}