package codingCompetitive.leetcodeSolutions.algoExpertProblems;

import java.util.Arrays;

public class minReward {

    public static int minRewards(int[] scores) {
        int[] rewards = new int[scores.length];
        Arrays.fill(rewards, 1);
        for (int i = 1; i < scores.length; i++) {
            int j = i - 1;
            if (scores[i] > scores[j])
                rewards[i] = rewards[j] + 1;
            else {
                while (j >= 0 && scores[j] > scores[j + 1]) {
                    rewards[j] = Math.max(rewards[j], rewards[j + 1] + 1);
                    j--;
                }
            }
        }
        int sum = 0;
        for (int reward: rewards) sum += reward;
        return sum;
    }

    public static void main(String[] args) {
        int[] scores = {8, 4, 2, 1, 3, 6, 7, 9, 5};
        System.out.println(minRewards(scores));
    }
}
