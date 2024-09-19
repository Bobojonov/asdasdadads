package codingCompetitive.leetcodeSolutions.dynamicProgramming;

import java.util.ArrayList;
import java.util.List;

public class DifferentWaysToAddParentheses {

    public static void main(String[] args) {
        String expression = "2-1-1";
        System.out.println(diffWaysToCompute(expression));
    }

    public static List<Integer> diffWaysToCompute(String expression) {
        List<Integer> result = new ArrayList<>();
        if (expression.length() == 0) return result;
        List<String> all = new ArrayList<>();
        for (int i = 0; i < expression.length(); i++) {
            int j = i;
            while (j < expression.length() && Character.isDigit(expression.charAt(j)))
                j++;
            String num = expression.substring(i, j);
            all.add(num);
            if (j != expression.length()) all.add(expression.substring(j, j + 1));
            i = j;
        }
        System.out.println(all);
        result = backtracking(all, 0, all.size() - 1);
        return result;
    }

    public static List<Integer> backtracking(List<String> all, int l ,int r) {
        List<Integer> res = new ArrayList<>();
        if (l == r) {
            Integer num = Integer.valueOf(all.get(l));
            res.add(num);
            return res;
        }

        for (int i = l + 1; i <= r - 1; i += 2) {
            String operator = all.get(i);
            List<Integer> left = backtracking(all, l, i - 1), right = backtracking(all, i + 1, r);
            for (int leftNum: left) {
                for (int rightNum: right) {
                    if (operator.equals("+"))
                        res.add(leftNum + rightNum);
                    else if (operator.equals("-")) res.add(leftNum - rightNum);
                    else res.add(leftNum * rightNum);
                }
            }
        }
        return res;
    }
}
