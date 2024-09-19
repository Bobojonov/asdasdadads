package codingCompetitive.leetcodeSolutions.problems;//package codingCompetitive.leetcodeSolutions.problems;
//
//public class PaintersPartitionProblem {
//
//    public int paint(int A, int B, int[] C) {
//        int mod = 10000003, n = C.length;
//        long l = 0, r = 0, sum = 0;
//        for (int i = 0; i < n; i++) {
//            sum = (sum + C[i]) % mod;
//        }
//        r = sum * B;
//        long res = r % mod;
//        while (l <= r) {
//            long mid = (r - l) / 2 + l;
//            if (check(A, C,mid / B)) {
//                res = mid % mod;
//                r = mid - 1;
//            } else l = mid + 1;
//        }
//        return (int)res % mod;
//    }
//
//    public static boolean check(int A, int[]C, long key) {
//        long target = key;
//        int l = 0, r = C.length, count = 1;
//        while (l < r) {
//            if (count > A) return false;
//            if (target < C[l]) {
//                count++;
//                target = key;
//            } else {
//                target -= C[l];
//                l++;
//            }
//        }
//        return true;
//    }
//}
