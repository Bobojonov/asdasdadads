package codingCompetitive.leetcodeSolutions.problems;

public class BaseSeven {

    public static String convertToBase7(int num) {
        if (num == 0) return "0";
        String sign = "";
        if (num < 0) {
            sign = "-";
            num = -num;
        }
        StringBuilder result = new StringBuilder();
        while(num > 0) {
            result.insert(0, (char) (48 + num % 7));
            num /= 7;
        }
        return sign + result;
    }

    public static void main(String[] args) {
        System.out.println(convertToBase7(0));
    }
}
