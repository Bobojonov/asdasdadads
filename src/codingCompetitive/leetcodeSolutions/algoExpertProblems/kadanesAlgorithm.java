package codingCompetitive.leetcodeSolutions.algoExpertProblems;

public class kadanesAlgorithm {

    public static int kadanesAlgorithm(int[] array) {
        int sum = 0, max = Integer.MIN_VALUE;
        for (int num: array){
            sum += num;
            max = Math.max(max, sum);
            if (sum < 0) sum = 0;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] array = {3, 5, -9, 1, 3, -2, 3, 4, 7, 2, -9, 6, 3, 1, -5, 4};
        System.out.println(kadanesAlgorithm(array));
    }
}
