package shuhuai.leetcode.problems.t137;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int singleNumberMap(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return 0;
    }

    public int singleNumberBinary(int[] nums) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            int total = 0;
            for (int num : nums) {
                total += (num >> i) & 1;
            }
            result |= (total % 3) << i;
        }
        return result;
    }

    public int singleNumberBinaryClever(int[] nums) {
        int a = 0;
        int b = 0;
        for (int num : nums) {
            b = ~a & (b ^ num);
            a = ~b & (a ^ num);
        }
        return b;
    }
}