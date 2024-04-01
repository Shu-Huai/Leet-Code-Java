package shuhuai.leetcode.problems.t1;

import org.junit.Test;
import shuhuai.leetcode.entity.IO;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {
    @Test
    public void simpleTest() {
        class Temp {
            protected final int[] arg1;
            protected final int arg2;

            public Temp(int[] arg1, int arg2) {
                this.arg1 = arg1;
                this.arg2 = arg2;
            }
        }
        List<IO<Temp, Integer[]>> testList = new ArrayList<>();
        testList.add(new IO<>(new Temp(new int[]{2, 7, 11, 15}, 9), new Integer[]{0, 1}));
        testList.add(new IO<>(new Temp(new int[]{3, 2, 4}, 6), new Integer[]{1, 2}));
        testList.add(new IO<>(new Temp(new int[]{3, 3}, 6), new Integer[]{0, 1}));
        Solution solution = new Solution();
        for (IO<Temp, Integer[]> io : testList) {
            assertArrayEquals(solution.simple(io.getInput().arg1, io.getInput().arg2),
                    Arrays.stream(io.getOutput()).mapToInt(Integer::valueOf).toArray());
        }
        System.out.println("T1成功");
    }

    @Test
    public void hashMapTest() {
        class Temp {
            protected final int[] arg1;
            protected final int arg2;

            public Temp(int[] arg1, int arg2) {
                this.arg1 = arg1;
                this.arg2 = arg2;
            }
        }
        List<IO<Temp, Integer[]>> testList = new ArrayList<>();
        testList.add(new IO<>(new Temp(new int[]{2, 7, 11, 15}, 9), new Integer[]{0, 1}));
        testList.add(new IO<>(new Temp(new int[]{3, 2, 4}, 6), new Integer[]{1, 2}));
        testList.add(new IO<>(new Temp(new int[]{3, 3}, 6), new Integer[]{0, 1}));
        Solution solution = new Solution();
        for (IO<Temp, Integer[]> io : testList) {
            assertArrayEquals(solution.hashMap(io.getInput().arg1, io.getInput().arg2),
                    Arrays.stream(io.getOutput()).mapToInt(Integer::valueOf).toArray());
        }
        System.out.println("T1成功");
    }
}