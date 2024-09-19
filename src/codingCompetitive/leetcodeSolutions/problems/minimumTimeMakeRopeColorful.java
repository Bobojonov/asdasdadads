package codingCompetitive.leetcodeSolutions.problems;

public class minimumTimeMakeRopeColorful {

    public static int minCost(String colors, int[] neededTime) {
        int n = colors.length();
        int min = 0;
        int i = 0, j = 0;
        while (i < neededTime.length && j < neededTime.length) {
            int curr = 0, max = 0;
            while (j < neededTime.length && colors.charAt(i) == colors.charAt(j)) {
                curr += neededTime[j];
                max = Math.max(max, neededTime[j]);
                j++;
            }
            min += curr - max;
            i = j;
        }
        return min;
    }

    public static void main(String[] args) {
        String colors = "aaa";
        int[] neededTime = {1, 0, 2};
        System.out.println(minCost(colors, neededTime));
    }
}
