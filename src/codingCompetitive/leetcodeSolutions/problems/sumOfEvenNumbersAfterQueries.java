package codingCompetitive.leetcodeSolutions.problems;

public class sumOfEvenNumbersAfterQueries {

    public static int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int[] result = new int[queries.length];
        int sum = 0;
        for (int num: nums)
            if (num % 2 == 0) sum += num;
        for (int i = 0; i < queries.length; i++) {
            int elem = queries[i][0], idx = queries[i][1];
            if (nums[idx] % 2 == 0) sum -= nums[idx];
            nums[idx] += elem;
            if (nums[idx] % 2 == 0) sum += nums[idx];
            result[i] = sum;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[][] queries = {{1,0},{-3,1},{-4,0},{2,3}};
        System.out.println(sumEvenAfterQueries(nums, queries));
    }
}
