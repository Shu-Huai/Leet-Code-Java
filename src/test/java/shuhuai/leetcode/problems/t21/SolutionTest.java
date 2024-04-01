package shuhuai.leetcode.problems.t21;

import org.junit.Test;
import shuhuai.leetcode.entity.IO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {
    @Test
    public void romanToIntTest() {
        List<IO<Map<String, Integer[]>, Integer[]>> testList = new ArrayList<>();
        testList.add(new IO<>(new HashMap<>() {
            {
                put("arg1", new Integer[]{1, 2, 4});
                put("arg2", new Integer[]{1, 3, 4});
            }
        }, new Integer[]{1, 1, 2, 3, 4, 4}));
        testList.add(new IO<>(new HashMap<>() {
            {
                put("arg1", new Integer[]{});
                put("arg2", new Integer[]{});
            }
        }, new Integer[]{}));
        testList.add(new IO<>(new HashMap<>() {
            {
                put("arg1", new Integer[]{});
                put("arg2", new Integer[]{0});
            }
        }, new Integer[]{0}));
        testList.add(new IO<>(new HashMap<>() {
            {
                put("arg1", new Integer[]{-9, 3});
                put("arg2", new Integer[]{5, 7});
            }
        }, new Integer[]{-9, 3, 5, 7}));
        Solution solution = new Solution();
        for (IO<Map<String, Integer[]>, Integer[]> io : testList) {
            ListNode head1 = new ListNode();
            ListNode p = head1;
            for (int i = 0; i < io.getInput().get("arg1").length; i++) {
                p.next = new ListNode(io.getInput().get("arg1")[i]);
                p = p.next;
            }
            head1 = head1.next;
            ListNode head2 = new ListNode();
            p = head2;
            for (int i = 0; i < io.getInput().get("arg2").length; i++) {
                p.next = new ListNode(io.getInput().get("arg2")[i]);
                p = p.next;
            }
            head2 = head2.next;
            ListNode head3 = solution.mergeTwoLists(head1, head2);
            ArrayList<Integer> temp = new ArrayList<>();
            Integer[] result;
            if (head3 == null) {
                result = new Integer[0];
            } else {
                while (head3 != null) {
                    temp.add(head3.val);
                    head3 = head3.next;
                }
                result = temp.toArray(new Integer[0]);
            }
            assertArrayEquals(result, io.getOutput());
        }
        System.out.println(solution.getClass().getPackage() + "测试成功");
    }
}