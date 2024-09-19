package codingCompetitive.leetcodeSolutions.leetcode.array;

import java.util.Arrays;

public class MinimumNumberOfMovesToSeat {
    public static int minMovesToSeat(int[] seats, int[] students) {
        int res = 0;
        int[] seatsSorted = Arrays.stream(seats).sorted().toArray();
        int[] studentsSorted = Arrays.stream(students).sorted().toArray();
        for (int i = 0; i < seats.length; i++) {
            res += Math.abs(studentsSorted[i] - seatsSorted[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] seats = {3, 1, 5};
        int[] students = {2, 7, 4};
        System.out.println(minMovesToSeat(seats, students));
    }
}
