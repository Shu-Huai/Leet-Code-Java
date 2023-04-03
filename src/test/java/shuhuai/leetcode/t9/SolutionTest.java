package shuhuai.leetcode.t9;

import org.junit.Test;
import shuhuai.leetcode.entity.IO;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void isPalindromeTest() {
        List<IO<Integer, Boolean>> testList = new ArrayList<>();
        testList.add(new IO<>(121, true));
        testList.add(new IO<>(-121, false));
        testList.add(new IO<>(10, false));
        Solution solution = new Solution();
        for (IO<Integer, Boolean> io : testList) {
            assertEquals(solution.isPalindrome(io.getInput()), io.getOutput());
        }
        System.out.println(solution.getClass().getPackage().toString() + "测试成功");
    }
}