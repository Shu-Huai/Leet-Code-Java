package shuhuai.leetcode.problems.t35;

import org.junit.Test;
import shuhuai.leetcode.entity.IO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void searchInsertTest() {
        List<IO<Map<String, Object>, Integer>> testList = new ArrayList<>();
        testList.add(new IO<>(new HashMap<>() {{
            put("arg1", new int[]{1, 3, 5, 6});
            put("arg2", 5);
        }}, 2));
        testList.add(new IO<>(new HashMap<>() {{
            put("arg1", new int[]{1, 3, 5, 6});
            put("arg2", 2);
        }}, 1));
        testList.add(new IO<>(new HashMap<>() {{
            put("arg1", new int[]{1, 3, 5, 6});
            put("arg2", 7);
        }}, 4));
        testList.add(new IO<>(new HashMap<>() {{
            put("arg1", new int[]{1, 3, 5, 6});
            put("arg2", 0);
        }}, 0));
        Solution solution = new Solution();
        for (IO<Map<String, Object>, Integer> io : testList) {
            assertEquals(solution.searchInsert((int[]) io.getInput().get("arg1"), (Integer) io.getInput().get("arg2")),
                    io.getOutput().intValue());
        }
        System.out.println(solution.getClass().getPackage() + "测试成功");
    }
}