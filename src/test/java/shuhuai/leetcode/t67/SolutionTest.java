package shuhuai.leetcode.t67;

import org.junit.Test;
import shuhuai.leetcode.entity.IO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void addBinaryTest() {
        List<IO<Map<String, String>, String>> testList = new ArrayList<>();
        testList.add(new IO<>(new HashMap<>() {{
            put("arg1", "11");
            put("arg2", "1");
        }}, "100"));
        testList.add(new IO<>(new HashMap<>() {{
            put("arg1", "1010");
            put("arg2", "1011");
        }}, "10101"));
        Solution solution = new Solution();
        for (IO<Map<String, String>, String> io : testList) {
            assertEquals(solution.addBinary(io.getInput().get("arg1"), io.getInput().get("arg2")),
                    io.getOutput());
        }
        System.out.println(solution.getClass().getPackage() + "测试成功");
    }
}