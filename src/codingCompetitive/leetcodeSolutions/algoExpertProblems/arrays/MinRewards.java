package codingCompetitive.leetcodeSolutions.algoExpertProblems.arrays;

public class MinRewards {

    public static int minRewards(int[] scores) {
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            int l = i;
            int r = i;
            while (l > 0 && scores[l] > scores[l - 1]) l--;
            while (r < scores.length - 1 && scores[r] > scores[r + 1]) r++;
            sum += Math.max(i - l, r - i) + 1;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(minRewards(new int[] {8, 4, 2, 1, 3, 6, 7, 9, 5}));
    }
}
