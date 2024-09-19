package codingCompetitive.leetcodeSolutions.problems;

public class bitwiseAndNumberRanges {

    public int rangeBitwiseAnd(int left, int right) {
        int result = right;
        while (right > left) {
            result = right * (right - 1);
            right = result;
        }
        return result;
    }
}
