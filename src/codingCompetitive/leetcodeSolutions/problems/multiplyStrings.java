package codingCompetitive.leetcodeSolutions.problems;

public class multiplyStrings {
    public static void main(String[] args) {
        String num1 = "123";
        String num2 = "456";
        int result = 0;
        if (num1.length() < num2.length()){
            for (int i = num1.length() - 1; i >= 0; i--){
                int sum = 0, r = 0;
                for (int j = num2.length() - 1; j >= 0; j--){
                    int s = (num2.charAt(j) - 'a') * (num1.charAt(i) - 'a') + r;
                    if (s > 10) {
                        r = s / 10;
                        sum += s % 10;
                    } else {
                        sum += s;
                        r = 0;
                    }
                }
                sum += r;
            }

        }

    }
}
