package shuhuai.leetcode.problems.t100;

import org.junit.Test;
import shuhuai.leetcode.entity.IO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void isSameTreeTest() {
        List<IO<Map<String, TreeNode>, Boolean>> testList = new ArrayList<>();
        testList.add(new IO<>(new HashMap<>() {{
            put("arg1", new TreeNode(1, new TreeNode(2), new TreeNode(3)));
            put("arg2", new TreeNode(1, new TreeNode(2), new TreeNode(3)));
        }}, true));
        testList.add(new IO<>(new HashMap<>() {{
            put("arg1", new TreeNode(1, new TreeNode(2), null));
            put("arg2", new TreeNode(1, null, new TreeNode(2)));
        }}, false));
        Solution solution = new Solution();
        for (IO<Map<String, TreeNode>, Boolean> io : testList) {
            assertEquals(solution.isSameTree(io.getInput().get("arg1"), io.getInput().get("arg2")), io.getOutput());
        }
        System.out.println(solution.getClass().getPackage() + "测试成功");
    }
}