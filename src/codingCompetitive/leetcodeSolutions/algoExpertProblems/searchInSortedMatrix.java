package codingCompetitive.leetcodeSolutions.algoExpertProblems;

public class searchInSortedMatrix {

    public static int[] searchInSortedMatrix(int[][] matrix, int target) {
        int l = 0, r = matrix.length - 1;
        while (l < matrix[0].length && r >= 0) {
            int num = matrix[r][l];
            if (num == target) return new int[] {r, l};
            if (num < target) l++;
            else r--;
        }
        return new int[] {-1, -1};
    }


}
