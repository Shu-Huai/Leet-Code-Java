package shuhuai.leetcode.problems.t700.t706;

import java.util.LinkedList;

@SuppressWarnings({"unused", "unchecked"})
public class MyHashMap {
    private static final int BASE = 769;
    private final LinkedList<Pair>[] data;

    /**
     * Initialize your data structure here.
     */
    public MyHashMap() {
        data = new LinkedList[BASE];
        for (int i = 0; i < BASE; ++i) {
            data[i] = new LinkedList<>();
        }
    }

    private static int hash(int key) {
        return key % BASE;
    }

    /**
     * value will always be non-negative.
     */
    public void put(int key, int value) {
        int h = hash(key);
        for (Pair pair : data[h]) {
            if (pair.getKey() == key) {
                pair.setValue(value);
                return;
            }
        }
        data[h].offerLast(new Pair(key, value));
    }

    /**
     * Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key
     */
    public int get(int key) {
        int h = hash(key);
        for (Pair pair : data[h]) {
            if (pair.getKey() == key) {
                return pair.value;
            }
        }
        return -1;
    }

    /**
     * Removes the mapping of the specified value key if this map contains a mapping for the key
     */
    public void remove(int key) {
        int h = hash(key);
        for (Pair pair : data[h]) {
            if (pair.key == key) {
                data[h].remove(pair);
                return;
            }
        }
    }

    private static class Pair {
        private final int key;
        private int value;

        public Pair(int key, int value) {
            this.key = key;
            this.value = value;
        }

        public int getKey() {
            return key;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }
}