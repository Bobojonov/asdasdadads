package codingCompetitive.yandex.contest.practice;

import java.util.*;

public class CombinationPhoneNumber {
    private static final Map<String, String> numberRules = new HashMap<>();

    static {
        numberRules.put("2", "abc");
        numberRules.put("3", "def");
        numberRules.put("4", "ghi");
        numberRules.put("5", "jkl");
        numberRules.put("6", "mno");
        numberRules.put("7", "pqrs");
        numberRules.put("8", "tuv");
        numberRules.put("9", "wxyz");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        List<String> combinations = solution(n);
        System.out.println(combinations);
    }

    public static List<String> solution(String digits) {
        if (digits.isEmpty()) {
            return new ArrayList<>();
        }

        List<String> result = new ArrayList<>();
        String words = numberRules.get(digits.substring(digits.length() - 1));
        List<String> combinations = solution(digits.substring(0, digits.length() - 1));

        if (!combinations.isEmpty()) {
            for (String combination : combinations) {
                for (char c : words.toCharArray()) {
                    result.add(combination + c);
                }
            }
        } else {
            for (char c : words.toCharArray()) {
                result.add(String.valueOf(c));
            }
        }

        return result;
    }

}
