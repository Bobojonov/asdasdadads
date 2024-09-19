package codingCompetitive.leetcodeSolutions.problems;

import java.util.stream.IntStream;

public class MaximumNumberOfWeeks {
    public long numberOfWeeks(int[] milestones) {
        long sum = IntStream.of(milestones).asLongStream().sum(), max = IntStream.of(milestones).max().getAsInt();
        return Math.min(sum, 2 * (sum - max) + 1);
    }
}
