package codingCompetitive.leetcodeSolutions.algoExpertProblems;

public class nThFibonacci {

    public static int getNthFib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return n + getNthFib(n - 1);
    }

    public static void main(String[] args) {

    }
}
