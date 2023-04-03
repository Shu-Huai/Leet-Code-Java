package shuhuai.leetcode.t206;

import org.junit.Test;
import shuhuai.leetcode.entity.IO;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {
    public ListNode createList(int[] arr) {
        ListNode result = new ListNode();
        ListNode p = result;
        for (int j : arr) {
            p.next = new ListNode(j);
            p = p.next;
        }
        return result.next;
    }

    public int[] createList(ListNode p) {
        List<Integer> temp = new ArrayList<>();
        while (p != null) {
            temp.add(p.val);
            p = p.next;
        }
        int[] result = new int[temp.size()];
        for (int i = 0; i < temp.size(); i++) {
            result[i] = temp.get(i);
        }
        return result;
    }

    @Test
    public void reverseListLoopTest() {
        List<IO<ListNode, ListNode>> testList = new ArrayList<>();
        testList.add(new IO<>(createList(new int[]{1, 2, 3, 4, 5}), createList(new int[]{5, 4, 3, 2, 1})));
        testList.add(new IO<>(createList(new int[]{1, 2}), createList(new int[]{2, 1})));
        testList.add(new IO<>(createList(new int[]{}), createList(new int[]{})));
        Solution solution = new Solution();
        for (IO<ListNode, ListNode> io : testList) {
            ListNode result = solution.reverseListLoop(io.getInput());
            assertArrayEquals(createList(result), createList(io.getOutput()));
        }
        System.out.println(solution.getClass().getPackage() + "测试成功");
    }

    @Test
    public void reverseListRecursiveTest() {
        List<IO<ListNode, ListNode>> testList = new ArrayList<>();
        testList.add(new IO<>(createList(new int[]{1, 2, 3, 4, 5}), createList(new int[]{5, 4, 3, 2, 1})));
        testList.add(new IO<>(createList(new int[]{1, 2}), createList(new int[]{2, 1})));
        testList.add(new IO<>(createList(new int[]{}), createList(new int[]{})));
        Solution solution = new Solution();
        for (IO<ListNode, ListNode> io : testList) {
            ListNode result = solution.reverseListRecursive(io.getInput());
            assertArrayEquals(createList(result), createList(io.getOutput()));
        }
        System.out.println(solution.getClass().getPackage() + "测试成功");
    }
}