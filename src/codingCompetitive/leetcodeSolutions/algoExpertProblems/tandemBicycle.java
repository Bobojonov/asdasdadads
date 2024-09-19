package codingCompetitive.leetcodeSolutions.algoExpertProblems;

import java.util.Arrays;

public class tandemBicycle {

    public int tandemBicycle(int[] redShirtSpeeds, int[] blueShirtSpeeds, boolean fastest) {
        Arrays.sort(redShirtSpeeds);
        Arrays.sort(blueShirtSpeeds);
        int i = fastest ? redShirtSpeeds.length -1 : 0;
        int sum = 0;
        for (int x: redShirtSpeeds) {
            sum += Math.max(x, blueShirtSpeeds[i]);
            i = fastest ? -1 : +1;
        }
        return sum;
    }

    public static void main(String[] args) {

    }
}
