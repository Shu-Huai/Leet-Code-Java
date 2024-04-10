package shuhuai.leetcode.problems.t202;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean isHappySet(int n) {
        Set<Integer> set = new HashSet<>();
        while (n != 1) {
            int temp = n;
            int result = 0;
            while (temp != 0) {
                int digit = temp % 10;
                result += digit * digit;
                temp /= 10;
            }
            if (set.contains(result)) {
                return false;
            }
            set.add(result);
            n = result;
        }
        return true;
    }

    public boolean isHappyLink(int n) {
        int slowRunner = n;
        int temp = n;
        int fastRunner = 0;
        while (temp != 0) {
            int digit = temp % 10;
            fastRunner += digit * digit;
            temp /= 10;
        }
        while (fastRunner != 1) {
            temp = slowRunner;
            slowRunner = 0;
            while (temp != 0) {
                int digit = temp % 10;
                slowRunner += digit * digit;
                temp /= 10;
            }
            for (int i = 0; i < 2; i++) {
                temp = fastRunner;
                fastRunner = 0;
                while (temp != 0) {
                    int digit = temp % 10;
                    fastRunner += digit * digit;
                    temp /= 10;
                }
            }
            if (fastRunner == slowRunner) {
                return false;
            }
        }
        return true;
    }

    public boolean isHappyMath(int n) {
        Set<Integer> set = new HashSet<>(Arrays.asList(4, 16, 37, 58, 89, 145, 42, 20));
        while (n != 1) {
            int temp = n;
            int result = 0;
            while (temp != 0) {
                int digit = temp % 10;
                result += digit * digit;
                temp /= 10;
            }
            if (set.contains(result)) {
                return false;
            }
            n = result;
        }
        return true;
    }
}