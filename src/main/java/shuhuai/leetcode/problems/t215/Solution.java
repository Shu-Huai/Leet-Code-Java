package shuhuai.leetcode.problems.t215;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Solution {
    public int findKthLargestSort(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }

    public int findKthLargestHeap(int[] nums, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for (int num : nums) {
            heap.add(num);
            if (heap.size() > k) {
                heap.poll();
            }
        }
        Integer value = heap.poll();
        return value == null ? -1 : value;
    }
}