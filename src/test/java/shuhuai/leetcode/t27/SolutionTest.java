package shuhuai.leetcode.t27;

import org.junit.Test;
import shuhuai.leetcode.entity.IO;

import java.util.*;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void romanToIntTest() {
        List<IO<Map<String, Object>, Integer>> testList = new ArrayList<>();
        testList.add(new IO<>(new HashMap<>() {{
            put("arg1", new int[]{3, 2, 2, 3});
            put("arg2", 3);
        }}, 2));
        testList.add(new IO<>(new HashMap<>() {{
            put("arg1", new int[]{0, 1, 2, 2, 3, 0, 4, 2});
            put("arg2", 2);
        }}, 5));
        Solution solution = new Solution();
        for (IO<Map<String, Object>, Integer> io : testList) {
            assertEquals(solution.removeElement((int[]) io.getInput().get("arg1"), (Integer) io.getInput().get("arg2")),
                    io.getOutput().intValue());
        }
        System.out.println(solution.getClass().getPackage() + "测试成功");
    }
}