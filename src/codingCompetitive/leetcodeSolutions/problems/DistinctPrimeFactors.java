package codingCompetitive.leetcodeSolutions.problems;

import java.util.HashSet;
import java.util.Set;

public class DistinctPrimeFactors {

    public static int distinctPrimeFactors(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n: nums) findPrime(set,n);
        return set.size();
    }
    static void findPrime(Set<Integer> set,int n) {
        int i = 2;
        while (n > 1) {
            if (n % i == 0) {
                set.add(i);
                n /= i;
            }
            else i++;
        }
    }

    public static void main(String[] args) {
        int[] nums = {2,4,8,16};
        System.out.println(distinctPrimeFactors(nums));
    }
}
