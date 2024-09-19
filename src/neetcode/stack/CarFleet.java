package neetcode.stack;

import java.util.Arrays;

public class CarFleet {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        double[][] pair = new double[n][2];
        for (int i = 0; i < n; i++) {
            pair[i][0] = position[i];
            pair[i][1] = speed[i];
        }
        Arrays.sort(pair, (a, b) -> Double.compare(b[0], a[0]));
        System.out.println(Arrays.deepToString(pair));
        int res = 0;
        double[] reachTime = new double[n];
        for (int i = 0; i < n; i++) {
            reachTime[i] = (target - pair[i][0]) / pair[i][1];
            if (i >= 1 && reachTime[i] <= reachTime[i - 1]) reachTime[i] = reachTime[i - 1];
            else res++;
        }
        return res;
    }
}
