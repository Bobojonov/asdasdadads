package codingCompetitive.leetcodeSolutions.problems;

public class numberToHexadecimal {

    public String toHex(int num) {
        char[] hex = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
        if (num == 0) return "0";
        String res = "";
        while (num != 0) {
            res = hex[(num & 15)] + res;
            num = (num >>> 4);
        }
        return res;
    }
}
