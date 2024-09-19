package codingCompetitive.leetcodeSolutions.algoExpertProblems;

public class reverseWordsInString {

    public static String reverseWordsInString(String string) {
        String reverse = "";
        String prev = "";
        for (int i = string.length() - 1; i >= 0; i--) {
            if (string.charAt(i) == ' ') {
                reverse = reverse + prev + " ";
                prev = "";
            } else prev = string.charAt(i) + prev;
        }
        return reverse + prev;
    }

    public static void main(String[] args) {
        String string = "AlgoExpert is the best!";
        System.out.println(reverseWordsInString(string));
    }
}
