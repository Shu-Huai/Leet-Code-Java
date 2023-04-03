package shuhuai.leetcode.t112;

import org.junit.Test;
import shuhuai.leetcode.entity.IO;

import java.util.*;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void isSameTreeTest() {
        List<IO<Map<String, Object>, Boolean>> testList = new ArrayList<>();
        testList.add(new IO<>(new HashMap<>() {{
            put("arg1", new TreeNode(1, new TreeNode(2), new TreeNode(3)));
            put("arg2", 22);
        }}, false));
        Solution solution = new Solution();
        for (IO<Map<String, Object>, Boolean> io : testList) {
            assertEquals(solution.hasPathSum((TreeNode) io.getInput().get("arg1"), (Integer) io.getInput().get("arg2")), io.getOutput());
        }
        System.out.println(solution.getClass().getPackage() + "测试成功");
    }
}