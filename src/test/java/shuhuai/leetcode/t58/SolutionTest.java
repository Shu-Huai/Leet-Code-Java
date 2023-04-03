package shuhuai.leetcode.t58;

import org.junit.Test;
import shuhuai.leetcode.entity.IO;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void lengthOfLastWordTest() {
        List<IO<String, Integer>> testList = new ArrayList<>();
        testList.add(new IO<>("Hello World", 5));
        testList.add(new IO<>("   fly me   to   the moon  ", 4));
        testList.add(new IO<>("luffy is still joyboy", 6));
        Solution solution = new Solution();
        for (IO<String, Integer> io : testList) {
            assertEquals(solution.lengthOfLastWord(io.getInput()), io.getOutput().intValue());
        }
        System.out.println(solution.getClass().getPackage() + "测试成功");
    }
}