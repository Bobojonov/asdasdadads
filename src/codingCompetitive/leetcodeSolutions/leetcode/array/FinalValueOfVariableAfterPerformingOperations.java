package codingCompetitive.leetcodeSolutions.leetcode.array;

public class FinalValueOfVariableAfterPerformingOperations {
    public int finalValueAfterOperations(String[] operations) {
        int count = 0;
        for (String operation : operations) {
            System.out.println(operation.indexOf(operation.length() - 1));
            if (operation.charAt(operation.length() - 1) == '+' || operation.charAt(0) == '+') count++;
            else count--;
        }
        return count;
    }
}
