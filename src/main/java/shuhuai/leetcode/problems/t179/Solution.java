package shuhuai.leetcode.problems.t179;

import java.util.Arrays;

public class Solution {
    public String largestNumber(int[] nums) {
        Integer[] numsI = Arrays.stream(nums).boxed().toArray(Integer[]::new);
        Arrays.sort(numsI, (b, a) -> {
            int tempA = a;
            int tempB = b;
            int countA = 0;
            while (tempA > 0) {
                tempA /= 10;
                countA++;
            }
            if (a == 0){
                countA = 1;
            }
            int countB = 0;
            while (tempB > 0) {
                tempB /= 10;
                countB++;
            }
            if (b == 0){
                countB = 1;
            }
            return (int) ((a *  Math.pow(10, countB) + b) - (b *  Math.pow(10, countA) + a));
        });
        if (numsI[0] == 0) {
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        for (Integer num : numsI) {
            sb.append(num);
        }
        return sb.toString();
    }
}