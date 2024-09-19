package codingCompetitive.leetcodeSolutions.problems;

public class NumberComplement {
    public int findComplement(int num) {
        char[] bin = Integer.toBinaryString(num).toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < bin.length; i++) {
            if (bin[i] == '0') bin[i] = '1';
            else bin[i] = '0';
            sb.append(bin[i]);
        }
        return Integer.parseInt(sb.toString(), 2);
    }
}
