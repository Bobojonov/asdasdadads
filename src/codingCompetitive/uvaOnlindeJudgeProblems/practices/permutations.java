package codingCompetitive.uvaOnlindeJudgeProblems.practices;

import java.util.HashSet;
import java.util.Set;

public class permutations {

    public static void main(String[] args) {
        String str = "ABCDEFGHIJ";

        System.out.println(getPermutation(str));
    }
    public static Set<String> getPermutation(String str) {
        Set<String> permutations = new HashSet<String>();
        if (str == null) {
            return null;
        } else if (str.length() == 0) {
            permutations.add("");
            return permutations;
        }
        char first = str.charAt(0);
        String sub = str.substring(1);
        Set<String> words = getPermutation(sub);
        for (String strNew : words) {
            for (int i = 0; i <= strNew.length(); i++) {
                permutations.add(strNew.substring(0, i) + first + strNew.substring(i));
            }
        }
        return permutations;
    }
//    public static void permutations(String ans, String s) {
//        if (s.length() == 0) {
//            System.out.println(ans + " ");
//            return;
//        }
//        for (int i = 0; i < s.length(); i++) {
//            char c = s.charAt(i);
//            String str = s.substring(0, i) + s.substring(i + 1);
//            permutations(ans + c, str);
//        }
//
//    }


}
