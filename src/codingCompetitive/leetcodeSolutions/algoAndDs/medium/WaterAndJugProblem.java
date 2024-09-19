package codingCompetitive.leetcodeSolutions.algoAndDs.medium;

import codingCompetitive.leetcodeSolutions.algoAndDs.ds.GCD;

public class WaterAndJugProblem {

    public boolean canMeasureWater(int jug1Capacity, int jug2Capacity, int targetCapacity) {
        int x = jug1Capacity, y = jug2Capacity, z = targetCapacity;
        if (x == z || y == z) return true;
        if (x == 0 || y == 0 || x + y < z) return false;
        int a = GCD.gcd(x, y);
        return z % a == 0;
    }

}
