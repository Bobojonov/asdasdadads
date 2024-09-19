package codingCompetitive.leetcodeSolutions.problems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class heNumberOfWeakCharactersGame {

    public int numberOfWeakCharacters(int[][] properties) {
        Arrays.sort(properties, (a, b) -> a[0] == b[0] ? b[1] - a[1] : a[0] - b[0]);
        int cnt = 0;
        int defense = 0;
        for (int i = properties.length - 1; i >= 0; i--) {
            if (properties[i][1] < defense) {
                cnt++;
            }
            defense = Math.max(defense, properties[i][1]);
        }

        return cnt;
    }
}
