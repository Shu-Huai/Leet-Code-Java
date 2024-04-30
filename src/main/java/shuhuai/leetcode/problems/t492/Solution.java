package shuhuai.leetcode.problems.t492;

public class Solution {
    public int[] constructRectangle(int area) {
        int begin = (int) Math.pow(area, 0.5);
        for (int i = begin; i > 0; i--) {
            if (area % i == 0) {
                return new int[]{area / i, i};
            }
        }
        return new int[]{0, 0};
    }
}