package shuhuai.leetcode.problems.t14;

import org.junit.Test;
import shuhuai.leetcode.entity.IO;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void longestCommonPrefixTest() {
        List<IO<String[], String>> testList = new ArrayList<>();
        testList.add(new IO<>(new String[]{"flower", "flow", "flight"}, "fl"));
        testList.add(new IO<>(new String[]{"dog", "racecar", "car"}, ""));
        Solution solution = new Solution();
        for (IO<String[], String> io : testList) {
            assertEquals(solution.longestCommonPrefix(io.getInput()), io.getOutput());
        }
        System.out.println(solution.getClass().getPackage() + "测试成功");
    }
}