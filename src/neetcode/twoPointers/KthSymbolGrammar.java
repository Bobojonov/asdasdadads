package neetcode.twoPointers;

public class KthSymbolGrammar {
    public int kthGrammar(int n, int k) {
        boolean res = true;
        n = (int) Math.pow(2, n - 1);
        while (n != 1) {
            n /= 2;
            if (k > n) {
                k -= n;
                res =  !res;
            }
        }
        return res ? 0 : 1;
    }
}
