package shuhuai.leetcode.t20;

import org.junit.Test;
import shuhuai.leetcode.entity.IO;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void longestCommonPrefixTest() {
        List<IO<String, Boolean>> testList = new ArrayList<>();
        testList.add(new IO<>("()", true));
        testList.add(new IO<>("()[]{}", true));
        testList.add(new IO<>("(]", false));
        testList.add(new IO<>("[", false));
        testList.add(new IO<>("]", false));
        Solution solution = new Solution();
        for (IO<String, Boolean> io : testList) {
            assertEquals(solution.isValid(io.getInput()), io.getOutput());
        }
        System.out.println(solution.getClass().getPackage() + "测试成功");
    }
}