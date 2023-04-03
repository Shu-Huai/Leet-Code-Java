package shuhuai.leetcode.t111;

import org.junit.Test;
import shuhuai.leetcode.entity.IO;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void minDepthTest() {
        List<IO<TreeNode, Integer>> testList = new ArrayList<>();
        testList.add(new IO<>(new TreeNode(2, null,
                new TreeNode(3, null,
                        new TreeNode(4, null,
                                new TreeNode(5, null,
                                        new TreeNode(6))))), 5));
        Solution solution = new Solution();
        for (IO<TreeNode, Integer> io : testList) {
            assertEquals(solution.minDepth(io.getInput()), io.getOutput().intValue());
        }
        System.out.println(solution.getClass().getPackage() + "测试成功");
    }
}