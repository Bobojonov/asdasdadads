package codingCompetitive.leetcodeSolutions.problems;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class squaresAndCubes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            Long n = sc.nextLong();
            find(n);

        }
    }

    public static void find(Long n) {
        Set<Long> set = new HashSet<>();
        for (long i = 1; i * i <= n; i++) set.add(i * i);
        for (long i = 1; i * i * i <= n; i++) set.add(i * i *i);
        System.out.println(set.size());
    }
}
