package shuhuai.leetcode.t26;

import org.junit.Test;
import shuhuai.leetcode.entity.IO;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void romanToIntTest() {
        List<IO<int[], Integer>> testList = new ArrayList<>();
        testList.add(new IO<>(new int[]{1, 1, 2}, 2));
        testList.add(new IO<>(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}, 5));
        Solution solution = new Solution();
        for (IO<int[], Integer> io : testList) {
            assertEquals(solution.removeDuplicates(io.getInput()), io.getOutput().intValue());
        }
        System.out.println(solution.getClass().getPackage() + "测试成功");
    }
}