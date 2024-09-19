package codingCompetitive.leetcodeSolutions;

public class FindTheStudentThatWillReplaceTheChalk {
    public static int chalkReplacer(int[] chalk, int k) {
        int replacer = 0, n = chalk.length;
        while (k - chalk[replacer] >= 0) {
            k -= chalk[replacer];
            replacer++;
            if (replacer == n)
                replacer = 0;
            if (k <= 0) break;
        }
        return replacer;
    }

    public static void main(String[] args) {
        int[] chalk = {3,4,1,2};
        int k = 25;
        System.out.println(chalkReplacer(chalk, k));
    }
}
