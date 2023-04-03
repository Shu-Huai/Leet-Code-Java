package shuhuai.leetcode.t169;

import java.util.*;

public class Solution {
    public int majorityElementMap(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int elem : nums) {
            if (map.containsKey(elem)) {
                map.put(elem, map.get(elem) + 1);
            } else {
                map.put(elem, 1);
            }
        }
        Map.Entry<Integer, Integer> max = new AbstractMap.SimpleEntry<>(Integer.MIN_VALUE, Integer.MIN_VALUE);
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max.getValue()) {
                max = entry;
            }
        }
        return max.getKey();
    }

    public int majorityElementSort(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }

    public int majorityElementRandom(int[] nums) {
        Random random = new Random();
        int majorityCount = nums.length / 2;
        while (true) {
            int candidate = nums[random.nextInt(nums.length)];
            int count = 0;
            for (int num : nums) {
                if (num == candidate) {
                    count++;
                }
            }
            if (count > majorityCount) {
                return candidate;
            }
        }
    }

    private int countInRange(int[] nums, int num, int lo, int hi) {
        int count = 0;
        for (int i = lo; i <= hi; i++) {
            if (nums[i] == num) {
                count++;
            }
        }
        return count;
    }

    public int majorityElementRecursive(int[] nums, int low, int high) {
        if (low == high) {
            return nums[low];
        }
        int mid = (high - low) / 2 + low;
        int left = majorityElementRecursive(nums, low, mid);
        int right = majorityElementRecursive(nums, mid + 1, high);
        if (left == right) {
            return left;
        }
        int leftCount = 0;
        int rightCount = 0;
        for (int i = low; i <= high; i++) {
            if (nums[i] == left) {
                leftCount++;
            }
            if (nums[i] == right) {
                rightCount++;
            }
        }
        return leftCount > rightCount ? left : right;
    }

    public int majorityElementRecursive(int[] nums) {
        return majorityElementRecursive(nums, 0, nums.length - 1);
    }

    public int majorityElementClever(int[] nums) {
        int count = 0;
        int candidate = 0;
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }
        return candidate;
    }
}