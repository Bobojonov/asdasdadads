package codingCompetitive.leetcodeSolutions.problems;

public class MagicalString {
    public int magicalString(int n) {
        if (n == 0) return 0;
        if (n <= 3) return 1;
        int[] arr = new int[n + 1];
        arr[0] = 1; arr[1] = 2; arr[2] = 2;
        int res = 1, head = 2, tail = 3, num = 1;
        while (tail < n) {
            for (int i = 0; i < arr[head]; i++) {
                arr[tail] = num;
                if (num == 1 && tail < n) res++;
                tail++;
            }
            num = num ^ 3;
            head++;
        }
        return res;
    }
}
