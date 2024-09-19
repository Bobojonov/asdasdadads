package codingCompetitive.leetcodeSolutions.problems;

public class FindPermutation {

    public int[] findPermutation(String s) {
        int r = s.length() + 1, l = r - 1;
        int[] res = new int[r];
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == 'I') {
                res[i + 1] = r--;
                res[i] = l--;
            } else if (i != 0){
                res[i] = r--;
                l--;
            }
        }
        if (s.charAt(0) == 'D') {
            res[1] = l++;
            res[0] = r--;
        }
        return res;
    }
}
