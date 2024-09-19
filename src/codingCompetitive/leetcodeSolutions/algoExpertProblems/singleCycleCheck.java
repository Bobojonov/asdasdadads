package codingCompetitive.leetcodeSolutions.algoExpertProblems;

public class singleCycleCheck {

    public static boolean hasSingleCycle(int[] array) {
        int len = array.length;
        int jumps = len;
        int idx = 0;
        while (jumps > 0) {
            if (array[idx] == 0) return false;
            int curr = (idx + (array[idx] % len) + len) % len;
            System.out.println(curr);
            if (curr == 0 && jumps == 1) return true;
            if (jumps > 1 && array[curr] == Integer.MAX_VALUE) return false;
            array[idx] = Integer.MAX_VALUE;
            idx = curr;
            jumps--;
        }
        return idx == 0;
    }

    public static void main(String[] args) {
        int[] array = {2, 3, 1, -4, -4, 2};
        System.out.println(hasSingleCycle(array));
    }
}
