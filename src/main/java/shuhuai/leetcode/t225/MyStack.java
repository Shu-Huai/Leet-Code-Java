package shuhuai.leetcode.t225;

import java.util.ArrayDeque;
import java.util.Objects;
import java.util.Queue;

public class MyStack {
    protected Queue<Integer> queue;

    public MyStack() {
        queue = new ArrayDeque<>();
    }

    public void push(int x) {
        int n = queue.size();
        queue.offer(x);
        for (int i = 0; i < n; i++) {
            queue.offer(queue.poll());
        }
    }

    public int pop() {
        return Objects.requireNonNull(queue.poll());
    }

    public int top() {
        return Objects.requireNonNull(queue.peek());
    }

    public boolean empty() {
        return queue.isEmpty();
    }
}