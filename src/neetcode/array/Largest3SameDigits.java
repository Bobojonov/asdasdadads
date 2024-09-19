package neetcode.array;

public class Largest3SameDigits {
    public static String largestGoodInteger(String num) {
        String res = "";
        int comp = -1;
        for (int i = 0; i < num.length() - 3; i++) {
            if (num.charAt(i) == num.charAt(i + 1) && num.charAt(i + 1) == num.charAt(i + 2)) {
                String curr = num.substring(i, i + 3);
                if (comp < Integer.parseInt(curr)) {
                    comp = Integer.parseInt(curr);
                    res = curr;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(largestGoodInteger("6777133339"));
    }
}
