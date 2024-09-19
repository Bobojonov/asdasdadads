package codingCompetitive.leetcodeSolutions.problems;

import java.util.HashMap;

public class FibonacciNumber {

    static HashMap<Integer, Integer> cashe = new HashMap<>();
    public int fib(int n ) {
        if (cashe.containsKey(n))
            return cashe.get(n);
        if (n < 2)
            return n;
        int res = fib(n - 2) + fib(n - 1);
        if (!cashe.containsKey(n))
            cashe.put(n, res);
        return res;
    }
}