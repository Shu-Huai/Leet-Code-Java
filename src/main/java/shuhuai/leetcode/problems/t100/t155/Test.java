package shuhuai.leetcode.problems.t100.t155;

import shuhuai.leetcode.utils.Printer;

import java.util.Scanner;

public class Test {
    public void test() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (!input.isEmpty()) {
            String[] strs = input.split(" ");
            input = scanner.nextLine();
            String[] ops = input.split(",");
            MinStack minStack = new MinStack();
            Object[] res = new Object[strs.length];
            for (int i = 0; i < strs.length; i++) {
                res[i] = null;
            }
            for (int i = 0; i < strs.length; i++) {
                switch (strs[i]) {
                    case "push" -> minStack.push(Integer.parseInt(ops[i]));
                    case "pop" -> minStack.pop();
                    case "top" -> res[i] = minStack.top();
                    case "getMin" -> res[i] = minStack.getMin();
                    case "MinStack" -> {
                        minStack = new MinStack();
                        res[i] = null;
                    }
                }
            }
            new Printer<>().printArray(res);
            input = scanner.nextLine();
        }
    }
}