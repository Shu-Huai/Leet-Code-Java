package shuhuai.leetcode.problems.t88;

import org.junit.Test;
import shuhuai.leetcode.entity.IO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {
    @Test
    public void mergeTest() {
        List<IO<Map<String, Object>, int[]>> testList = new ArrayList<>();
        testList.add(new IO<>(new HashMap<>() {{
            put("arg1", new int[]{1, 2, 3, 0, 0, 0});
            put("arg2", 3);
            put("arg3", new int[]{2, 5, 6});
            put("arg4", 3);
        }}, new int[]{1, 2, 2, 3, 5, 6}));
        testList.add(new IO<>(new HashMap<>() {{
            put("arg1", new int[]{1});
            put("arg2", 1);
            put("arg3", new int[]{});
            put("arg4", 0);
        }}, new int[]{1}));
        testList.add(new IO<>(new HashMap<>() {{
            put("arg1", new int[]{0});
            put("arg2", 0);
            put("arg3", new int[]{1});
            put("arg4", 1);
        }}, new int[]{1}));
        Solution solution = new Solution();
        for (IO<Map<String, Object>, int[]> io : testList) {
            solution.merge((int[]) io.getInput().get("arg1"), (Integer) io.getInput().get("arg2"),
                    (int[]) io.getInput().get("arg3"), (Integer) io.getInput().get("arg4"));
            assertArrayEquals((int[]) io.getInput().get("arg1"), io.getOutput());
        }
        System.out.println(solution.getClass().getPackage() + "测试成功");
    }
}