package shuhuai.leetcode.problems.t100.t155;

import java.util.Stack;

public class MinStack {
    protected Stack<Integer> min;
    protected Stack<Integer> items;

    public MinStack() {
        min = new Stack<>();
        items = new Stack<>();
        min.push(Integer.MAX_VALUE);
    }

    public void push(int val) {
        items.push(val);
        min.push(Math.min(val, min.peek()));
    }

    public void pop() {
        items.pop();
        min.pop();
    }

    public int top() {
        return items.peek();
    }

    public int getMin() {
        return min.peek();
    }
}