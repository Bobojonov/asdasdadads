package codingCompetitive.leetcodeSolutions;

public class ConvertTitle {
    public static void main(String[] args) {
        System.out.println(convertToTitle(701));
    }
    public static String convertToTitle(int columnNumber) {
        String x = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String res = "";
        System.out.println(converter(columnNumber, res, x));
        return res;
    }

    public static String converter(int n, String res, String x) {
        if (n == 0) return res;
        return converter((n - 1)/ 26,x.charAt((n - 1) % 26) + res, x);
    }

}
