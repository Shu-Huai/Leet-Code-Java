package shuhuai.leetcode.problems.t100.t190;

public class Solution {
    public int reverseBitsSimple(int n) {
        int result = 0;
        int count = 0;
        while (n != 0) {
            result |= (n & 1) << (31 - count);
            n >>>= 1;
            count++;
        }
        return result;
    }

    public int reverseBitsClever(int n) {
        int M1 = 0x55555555;
        n = n >>> 1 & M1 | (n & M1) << 1;
        int M2 = 0x33333333;
        n = n >>> 2 & M2 | (n & M2) << 2;
        int M4 = 0x0f0f0f0f;
        n = n >>> 4 & M4 | (n & M4) << 4;
        int M8 = 0x00ff00ff;
        n = n >>> 8 & M8 | (n & M8) << 8;
        return n >>> 16 | n << 16;
    }
}