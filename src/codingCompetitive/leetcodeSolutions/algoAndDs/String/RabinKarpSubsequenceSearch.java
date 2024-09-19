package codingCompetitive.leetcodeSolutions.algoAndDs.String;

public class RabinKarpSubsequenceSearch {
    int prime = 31;

    public int searchPattern(char[] text, char[] pattern) {
        int m = text.length;
        int n = pattern.length;
        int textHash = hash(text, n);
        int patternHas = hash(pattern, n);
        for (int i = 0; i <= m - n; i++) {
            if (patternHas == textHash && equal(text, pattern, i)) return i;
            if (i <  m - n) textHash = reHash(textHash, text[i], text[i + n], n);
        }
        return -1;
    }

    private int reHash(int textHash, char first, char last, int length) {
        int h = (textHash - first) / prime;
        h += Math.pow(prime, length - 1) * last;
        return h;
    }

    private boolean equal(char[] text, char[] pattern, int from) {
        for (int i = 0; i < pattern.length; i++)
            if (text[i + from] != pattern[i])
                return false;
        return true;
    }
    private int hash(char[] s, int to) {
        int h = 0;
        for (int i = 0; i < to; i++)
            h += Math.pow(prime, i) * s[i];
        return h;
    }

    public static void main(String[] args) {
        RabinKarpSubsequenceSearch rks = new RabinKarpSubsequenceSearch();
        System.out.println(rks.searchPattern("Bobojon".toCharArray(), "n".toCharArray()));
        System.out.println(rks.searchPattern("Bobojon".toCharArray(), "jon".toCharArray()));
        System.out.println(rks.searchPattern("Bobojon".toCharArray(), "boj".toCharArray()));
        System.out.println(rks.searchPattern("Bobojon".toCharArray(), "B".toCharArray()));
    }
}
