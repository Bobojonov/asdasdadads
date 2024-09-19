package codingCompetitive.leetcodeSolutions.problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MinimumRoundsCompleteAllTasks {

    public static int minimumRounds(int[] tasks) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int res = 0;
        for (int t : tasks) map.put(t, map.getOrDefault(t, 0) + 1);
        System.out.println(map);
        for (Map.Entry<Integer, Integer> mp : map.entrySet()) {
            if (mp.getValue() < 2) return -1;
            int t = mp.getValue();
            while (t > 0) {
                if (t % 3 == 0)
                    t -= 3;
                else t -= 2;
                res++;
            }
            if (t != 0) return -1;
        }
        return res;
    }

    private static int pow(int res, int x) {
        if (x == 1) return res;
        return pow(res + 1, x / 2);
    }

    public static void main(String[] args) {
        int[] tasks = {218,211,220,218,211,218,218,217,213,215,219,214,210,210,212,219,214,211,216,218,211,216,218,218,
                212,210,211,211,215,216,212,219,219,210,217,218,217,217,213,216,217,212,217,219,215,217,215,218,210,218,
                218,210,212,219,217,214,216,218,220,217,215,215,213,210,212,211,215,218,214,212,211,216,210,216,218,220,
                211,211,212,218,218,210,215,210,215,213,212,220,217,219,214,216,217,214,215,213,218,219,220,219,215,216,
                219,218,211,215,210,214,210,215,219,214,212,217,219,215,214,217,213,219,213,218,217,214,216,219,217,217,
                211,214,214,220,220,216,218,216,220,211,213,219,218,219,215,216,216,220,211,214,212,219,210,215,218,218,
                220,210,214,211,217,214,220,214,213,210,219,213,214,210,212,216,210,217,211,215,217,213,214,210,217,212,
                217,216,217,210,211,213,214,220,211,216,214,211,217,211,211,215,219,219,213,216};
        System.out.println(minimumRounds(tasks));
    }
}
