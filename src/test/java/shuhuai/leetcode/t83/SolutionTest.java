package shuhuai.leetcode.t83;

import org.junit.Test;
import shuhuai.leetcode.entity.IO;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {
    @Test
    public void deleteDuplicatesTest() {
        List<IO<int[], Integer[]>> testList = new ArrayList<>();
        testList.add(new IO<>(new int[]{1, 1, 2}, new Integer[]{1, 2}));
        testList.add(new IO<>(new int[]{1, 1, 2, 3, 3}, new Integer[]{1, 2, 3}));
        testList.add(new IO<>(new int[]{1, 1, 1}, new Integer[]{1}));
        Solution solution = new Solution();
        for (IO<int[], Integer[]> io : testList) {
            ListNode head1 = new ListNode();
            ListNode p = head1;
            for (int i = 0; i < io.getInput().length; i++) {
                p.next = new ListNode(io.getInput()[i]);
                p = p.next;
            }
            head1 = head1.next;
            ListNode head2 = solution.deleteDuplicates(head1);
            ArrayList<Integer> temp = new ArrayList<>();
            Integer[] result;
            if (head2 == null) {
                result = new Integer[0];
            } else {
                while (head2 != null) {
                    temp.add(head2.val);
                    head2 = head2.next;
                }
                result = temp.toArray(new Integer[0]);
            }
            assertArrayEquals(result, io.getOutput());
        }
        System.out.println(solution.getClass().getPackage() + "测试成功");
    }
}