package shuhuai.leetcode.problems.t933;

import java.util.ArrayDeque;
import java.util.Queue;

public class RecentCounter {
    private final Queue<Integer> queue;

    public RecentCounter() {
        queue = new ArrayDeque<>();
    }

    public int ping(int t) {
        queue.add(t);
        while (!queue.isEmpty() && queue.peek() < t - 3000) {
            queue.poll();
        }
        return queue.size();
    }
}