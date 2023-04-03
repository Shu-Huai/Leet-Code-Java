package shuhuai.leetcode.t110;

import org.junit.Test;
import shuhuai.leetcode.entity.IO;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void isSymmetricTest() {
        List<IO<TreeNode, Boolean>> testList = new ArrayList<>();
        testList.add(new IO<>(new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15),
                new TreeNode(7))), true));
        testList.add(new IO<>(null, true));
        Solution solution = new Solution();
        for (IO<TreeNode, Boolean> io : testList) {
            assertEquals(solution.isBalanced(io.getInput()), io.getOutput());
        }
        System.out.println(solution.getClass().getPackage() + "测试成功");
    }
}