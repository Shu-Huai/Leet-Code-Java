package shuhuai.leetcode.t101;

import org.junit.Test;
import shuhuai.leetcode.entity.IO;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void isSymmetricTest() {
        List<IO<TreeNode, Boolean>> testList = new ArrayList<>();
        testList.add(new IO<>(new TreeNode(1, new TreeNode(2, new TreeNode(3), new TreeNode(4)),
                new TreeNode(2, new TreeNode(4), new TreeNode(3))), true));
        testList.add(new IO<>(new TreeNode(1, new TreeNode(2, null, new TreeNode(3)),
                new TreeNode(2, null, new TreeNode(3))), false));
        Solution solution = new Solution();
        for (IO<TreeNode, Boolean> io : testList) {
            assertEquals(solution.isSymmetric(io.getInput()), io.getOutput());
        }
        System.out.println(solution.getClass().getPackage() + "测试成功");
    }
}