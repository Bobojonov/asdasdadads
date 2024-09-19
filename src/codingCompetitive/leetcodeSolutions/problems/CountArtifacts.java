package codingCompetitive.leetcodeSolutions.problems;

import java.util.HashSet;
import java.util.Set;

public class CountArtifacts {

    public int digArtifacts(int n, int[][] artifacts, int[][] dig) {
        Set<String> set = new HashSet<>();
        for (int[] d: dig) set.add(d[0] + " " + d[1]);
        int cnt = 0;
        for (int[] art: artifacts) {
            boolean digged = true;
            for (int i = art[0]; i <= art[2]; i++) {
                for (int j = art[1]; j <= art[3]; j++)
                    if (!set.contains(i + " " + j))
                        digged = false;
            }
            if (digged) cnt++;
        }
        return cnt;
    }
}
