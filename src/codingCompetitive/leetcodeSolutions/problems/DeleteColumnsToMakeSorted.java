package codingCompetitive.leetcodeSolutions.problems;

public class DeleteColumnsToMakeSorted {

    public static int minDeletionSize(String[] strs) {
        if (strs.length == 1) return 0;
        int cnt = 0;
        for (int i = 0; i < strs[0].length(); i++) {
            for (int j = 0; j < strs.length - 1; j++) {
                if (strs[j].charAt(i) > strs[j + 1].charAt(i)) {
                    cnt++;
                    break;
                }
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
//        String[] strs = {"cba","daf","ghi"};
//        String[] strs = {"a","b"};
        String[] strs = {"rrjk","furt","guzm"};

        System.out.println(minDeletionSize(strs));
    }
}
