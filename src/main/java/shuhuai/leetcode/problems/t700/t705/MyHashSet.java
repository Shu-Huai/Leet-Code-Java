package shuhuai.leetcode.problems.t700.t705;

import java.util.LinkedList;

@SuppressWarnings({"unused", "unchecked"})
public class MyHashSet {
    private static final int BASE = 769;
    private final LinkedList<Integer>[] data;

    /**
     * Initialize your data structure here.
     */
    public MyHashSet() {
        data = new LinkedList[BASE];
        for (int i = 0; i < BASE; ++i) {
            data[i] = new LinkedList<>();
        }
    }

    private static int hash(int key) {
        return key % BASE;
    }

    public void add(int key) {
        int h = hash(key);
        for (Integer element : data[h]) {
            if (element == key) {
                return;
            }
        }
        data[h].offerLast(key);
    }

    public void remove(int key) {
        int h = hash(key);
        for (Integer element : data[h]) {
            if (element == key) {
                data[h].remove(element);
                return;
            }
        }
    }

    public boolean contains(int key) {
        int h = hash(key);
        for (Integer element : data[h]) {
            if (element == key) {
                return true;
            }
        }
        return false;
    }
}