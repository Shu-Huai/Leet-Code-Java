package shuhuai.leetcode.problems.t66;

import org.junit.Test;
import shuhuai.leetcode.entity.IO;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {
    @Test
    public void plusOneTest() {
        List<IO<int[], int[]>> testList = new ArrayList<>();
        testList.add(new IO<>(new int[]{1, 2, 3}, new int[]{1, 2, 4}));
        testList.add(new IO<>(new int[]{4,3,2,1}, new int[]{4,3,2,2}));
        testList.add(new IO<>(new int[]{0}, new int[]{1}));
        Solution solution = new Solution();
        for (IO<int[], int[]> io : testList) {
            assertArrayEquals(solution.plusOne(io.getInput()), io.getOutput());
        }
        System.out.println(solution.getClass().getPackage() + "测试成功");
    }
}