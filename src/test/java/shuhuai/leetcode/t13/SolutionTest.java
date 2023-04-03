package shuhuai.leetcode.t13;

import org.junit.Test;
import shuhuai.leetcode.entity.IO;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void romanToIntTest() {
        List<IO<String, Integer>> testList = new ArrayList<>();
        testList.add(new IO<>("III", 3));
        testList.add(new IO<>("IV", 4));
        testList.add(new IO<>("IX", 9));
        testList.add(new IO<>("LVIII", 58));
        testList.add(new IO<>("MCMXCIV", 1994));
        Solution solution = new Solution();
        for (IO<String, Integer> io : testList) {
            assertEquals(solution.romanToInt(io.getInput()), io.getOutput().intValue());
        }
        System.out.println(solution.getClass().getPackage() + "测试成功");
    }
}