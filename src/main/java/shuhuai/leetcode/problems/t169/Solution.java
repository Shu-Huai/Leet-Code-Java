package shuhuai.leetcode.problems.t169;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Solution {
    public int majorityElementMap(int[] nums) {
        Map<Integer, Integer> counter = new HashMap<>();
        for (int num : nums) {
            if (counter.containsKey(num)) {
                counter.put(num, counter.get(num) + 1);
            } else {
                counter.put(num, 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : counter.entrySet()) {
            if (entry.getValue() > nums.length / 2) {
                return entry.getKey();
            }
        }
        return 0;
    }

    public int majorityElementSort(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }

    public int majorityElementRandom(int[] nums) {
        Random random = new Random();
        int count = 0;
        int candidate = 0;
        while (count <= nums.length / 2) {
            count = 0;
            candidate = nums[random.nextInt(nums.length)];
            for (int num : nums) {
                if (num == candidate) {
                    count++;
                }
            }
        }
        return candidate;
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