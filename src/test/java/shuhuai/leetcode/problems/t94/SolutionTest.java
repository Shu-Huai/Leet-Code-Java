package shuhuai.leetcode.problems.t94;

import org.junit.Test;
import shuhuai.leetcode.entity.IO;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {
    @Test
    public void inorderTraversalTest() {
        List<IO<TreeNode, int[]>> testList = new ArrayList<>();
        testList.add(new IO<>(new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null)),
                new int[]{1, 3, 2}));
        testList.add(new IO<>(null, new int[]{}));
        testList.add(new IO<>(new TreeNode(1), new int[]{1}));
        Solution solution = new Solution();
        for (IO<TreeNode, int[]> io : testList) {
            List<Integer> result = solution.inorderTraversal(io.getInput());
            int[] temp = new int[result.size()];
            for (int i = 0; i < result.size(); i++) {
                temp[i] = result.get(i);
            }
            assertArrayEquals(temp, io.getOutput());
        }
        System.out.println(solution.getClass().getPackage() + "测试成功");
    }
}