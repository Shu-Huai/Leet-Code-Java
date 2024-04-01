package shuhuai.leetcode.problems.t69;

import org.junit.Test;
import shuhuai.leetcode.entity.IO;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void mySqrtTest() {
        List<IO<Integer, Integer>> testList = new ArrayList<>();
        testList.add(new IO<>(4, 2));
        testList.add(new IO<>(8, 2));
        Solution solution = new Solution();
        for (IO<Integer, Integer> io : testList) {
            assertEquals(solution.mySqrt(io.getInput()), io.getOutput().intValue());
        }
        System.out.println(solution.getClass().getPackage().toString() + "测试成功");
    }
}