package shuhuai.leetcode.problems.t380;

import java.util.*;

class RandomizedSet {
    protected List<Integer> list;
    protected Map<Integer, Integer> map;
    protected Random random;

    public RandomizedSet() {
        list = new ArrayList<>();
        map = new HashMap<>();
        random = new Random();
    }

    public boolean insert(int val) {
        if (map.containsKey(val)) {
            return false;
        }
        list.add(val);
        map.put(val, list.size() - 1);
        return true;
    }

    public boolean remove(int val) {
        if (!map.containsKey(val)) {
            return false;
        }
        int index = map.get(val);
        int last = list.getLast();
        list.set(index, last);
        list.removeLast();
        map.put(last, index);
        map.remove(val);
        return true;
    }

    public int getRandom() {
        return list.get(random.nextInt(list.size()));
    }
}