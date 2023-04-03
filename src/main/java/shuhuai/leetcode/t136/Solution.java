package shuhuai.leetcode.t136;

public class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int elem : nums) {
            result ^= elem;
        }
        return result;
    }

    public static void main(String[] args) {
        int x = 2;
        while (x <= 10) {
            x = x + x;
            System.out.println(1);
        }
    }
}