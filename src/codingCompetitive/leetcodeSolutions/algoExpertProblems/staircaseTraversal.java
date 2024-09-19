package codingCompetitive.leetcodeSolutions.algoExpertProblems;

import java.util.ArrayList;
import java.util.List;

public class staircaseTraversal {

    public static int staircaseTraversal(int height, int maxSteps) {
        if (height <= 1) return 1;
        List<Integer> ways = new ArrayList<>();
        ways.add(1);
        ways.add(1);
        int count = 1;
        for (int i = 2; i <= maxSteps; i++){
            count *= 2;
            ways.add(count);
        }
        for (int i = maxSteps + 1; i <= height; i++) {
            count = count + ways.get(ways.size() - 1) - ways.remove(0);
            ways.add(count);
        }
        return ways.get(ways.size() - 1);
    }

    public static void main(String[] args) {
        int height = 4;
        int maxSteps = 2;
        System.out.println(staircaseTraversal(height, maxSteps));
    }
}
