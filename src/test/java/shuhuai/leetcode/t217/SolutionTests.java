package shuhuai.leetcode.t217;

import org.junit.Test;
import shuhuai.leetcode.entity.IO;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SolutionTests {
    @Test
    public void containsDuplicateTest() {
        List<IO<int[], Boolean>> testList = new ArrayList<>();
        testList.add(new IO<>(new int[]{1, 2, 3, 1}, true));
        testList.add(new IO<>(new int[]{1, 2, 3, 4}, false));
        testList.add(new IO<>(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2}, true));
        Solution solution = new Solution();
        for (IO<int[], Boolean> io : testList) {
            assertEquals(solution.containsDuplicate(io.getInput()), io.getOutput());
        }
        System.out.println(solution.getClass().getPackage() + "测试成功");
    }
}