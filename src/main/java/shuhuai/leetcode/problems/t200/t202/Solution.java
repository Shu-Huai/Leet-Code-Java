package shuhuai.leetcode.problems.t200.t202;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean isHappySet(int n) {
        Set<Integer> set = new HashSet<>();
        while (n != 1) {
            int sum = 0;
            int temp = n;
            while (temp != 0) {
                int digit = temp % 10;
                sum += digit * digit;
                temp /= 10;
            }
            if (set.contains(sum)) {
                return false;
            }
            set.add(sum);
            n = sum;
        }
        return true;
    }

    public boolean isHappyLink(int n) {
        int fast = n;
        int slow = n;
        // 使用lambda表达式
        do {
            int sum = 0;
            int temp = fast;
            while (temp != 0) {
                int digit = temp % 10;
                sum += digit * digit;
                temp /= 10;
            }
            fast = sum;
            sum = 0;
            temp = fast;
            while (temp != 0) {
                int digit = temp % 10;
                sum += digit * digit;
                temp /= 10;
            }
            fast = sum;
            temp = slow;
            sum = 0;
            while (temp != 0) {
                int digit = temp % 10;
                sum += digit * digit;
                temp /= 10;
            }
            slow = sum;
        } while (slow != fast);
        return slow == 1;
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