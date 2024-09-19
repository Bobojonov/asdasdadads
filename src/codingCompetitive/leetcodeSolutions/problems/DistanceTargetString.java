package codingCompetitive.leetcodeSolutions.problems;

public class DistanceTargetString {

    public int closetTarget(String[] words, String target, int startIndex) {
        int n = words.length, res = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (words[i].equals(target))
                res = Math.min(res, Math.min(Math.abs(startIndex - i), Math.abs(n - Math.abs(startIndex - i))));
            System.out.println(res);
        }
        return res == Integer.MAX_VALUE ? -1 : res;
    }
}
