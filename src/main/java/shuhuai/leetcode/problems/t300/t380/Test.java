package shuhuai.leetcode.problems.t300.t380;

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
            RandomizedSet randomizedSet = new RandomizedSet();
            Object[] res = new Object[strs.length];
            for (int i = 0; i < strs.length; i++) {
                switch (strs[i]) {
                    case "insert" -> res[i] = randomizedSet.insert(Integer.parseInt(ops[i]));
                    case "remove" -> res[i] = randomizedSet.remove(Integer.parseInt(ops[i]));
                    case "getRandom" -> res[i] = randomizedSet.getRandom();
                    case "RandomizedSet" -> {
                        randomizedSet = new RandomizedSet();
                        res[i] = null;
                    }
                }
            }
            new Printer<>().printArray(res);
            input = scanner.nextLine();
        }
    }
}