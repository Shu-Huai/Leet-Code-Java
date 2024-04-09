package shuhuai.leetcode.utils;

public class Printer<ElemType> {
    public void printArray(ElemType[] elems, int begin, int end) {
        for (int i = begin; i < end; i++) {
            System.out.print(elems[i]);
            System.out.print(" ");
        }
        System.out.println();
    }
}