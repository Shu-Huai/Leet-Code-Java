package shuhuai.leetcode.problems.t0.t6;

public class Solution {
    public String convert(String s, int numRows) {
        StringBuilder[] sb = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            sb[i] = new StringBuilder();
        }
        int index = 0;
        int status = 0;
        for (int i = 0; i < s.length(); i++) {
            sb[index].append(s.charAt(i));
            if (status == 0) {
                index++;
                if (index == numRows) {
                    index = numRows - 2;
                    index = Math.max(0, index);
                    status = 1;
                }
            } else {
                index--;
                if (index == -1) {
                    index = 1;
                    index = Math.min(numRows - 1, index);
                    status = 0;
                }
            }
        }
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            res.append(sb[i]);
        }
        return res.toString();
    }
}