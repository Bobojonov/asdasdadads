package codingCompetitive.leetcodeSolutions.problems;

import java.util.Objects;
import java.util.Vector;

public class CountPrimes {


    static Vector<Boolean> vc = new Vector<>();
    public static int countPrimes(int n) {
        int cnt = 0;
        for (int i = 0; i < n; i++)
            vc.add(false);
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (!vc.get(i)) {
                for (int j = i * i; j < n; j +=i) {
                    vc.set(j, true);
                }
            }
        }
        for (int i = 2; i < n; i++)
            if(!vc.get(i)) cnt++;
        return cnt;
    }
    //https://cp-algorithms.com/algebra/prime-sieve-linear.html
//    static int max = 5000001;
//    static Vector<Integer> lp = new Vector<>();
//    static Vector<Integer> pr = new Vector<>();
//    public static int countPrimes(int n) {
//        findPrimes(n);
//        int cnt = 0;
//        for (Integer prime: pr) {
//            if (prime < n) cnt++;
//            else break;
//        }
//        return cnt;
//    }
//
//    public static void findPrimes(int n) {
//        for (int i = 0; i <= max; i++)
//            lp.add(0);
//        for (int i = 2; i <= max; i++) {
//            if (lp.get(i) == 0) {
//                lp.set(i, i);
//                pr.add(i);
//            }
//            for (int j = 0; i * pr.get(j) <= max; ++j) {
//                lp.set(i * pr.get(j), pr.get(j));
//                if (Objects.equals(pr.get(j), lp.get(i)))
//                    break;
//            }
//        }
//    }

    public static void main(String[] args) {

        System.out.println(countPrimes(192309)); //499979
    }
}
