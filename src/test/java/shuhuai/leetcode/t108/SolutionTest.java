package shuhuai.leetcode.t108;

import org.junit.Test;
import shuhuai.leetcode.entity.IO;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void sortedArrayToBSTTest() {
        List<IO<int[], TreeNode>> testList = new ArrayList<>();
        testList.add(new IO<>(new int[]{-10, -3, 0, 5, 9}, new TreeNode(0, new TreeNode(-10, null,
                new TreeNode(-3)), new TreeNode(5, null, new TreeNode(0)))));
        testList.add(new IO<>(new int[]{1, 3}, new TreeNode(1, null, new TreeNode(3))));
        Solution solution = new Solution();
        for (IO<int[], TreeNode> io : testList) {
            assertEquals(solution.sortedArrayToBST(io.getInput()).val, io.getOutput().val);
        }
        System.out.println(solution.getClass().getPackage() + "测试成功");
    }
}