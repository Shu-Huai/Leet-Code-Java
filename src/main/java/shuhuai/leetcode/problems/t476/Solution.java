package shuhuai.leetcode.problems.t476;

public class Solution {
    public int findComplement(int num) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            int temp = num & 1;
            if (temp == 0) {
                temp = 1;
            } else {
                temp = 0;
            }
            result += temp << i;
            num = num >>> 1;
            if (num == 0) {
                break;
            }
        }
        return result;
    }
}