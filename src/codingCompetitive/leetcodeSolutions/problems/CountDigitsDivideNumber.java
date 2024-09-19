package codingCompetitive.leetcodeSolutions.problems;

public class CountDigitsDivideNumber {

    public int countDigits(int num) {
        int cnt = 0;
        int n = num;
        while (num > 0) {
            if (n % (n % 10) == 0) cnt++;
            num /= 10;
        }
        return cnt;
    }
}
