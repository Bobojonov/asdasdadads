package codingCompetitive.leetcodeSolutions.problems;

import java.util.ArrayList;
import java.util.List;

public class removeComments {

    public static List<String> removeComments(String[] source) {
        List<String> result = new ArrayList<>();
        boolean f = false;
        StringBuilder sb = new StringBuilder();
        for (String s: source) {
            for (int i = 0; i < s.length(); i++) {
                if (i < s.length() - 1 && s.charAt(i) == '*' && s.charAt(i + 1) == '/') {
                    f = false;
                    i++;
                }
                else {
                    if (i < s.length() - 1 && s.charAt(i) == '/' && s.charAt(i + 1) == '/')
                        break;
                    else if (i < s.length() - 1 && s.charAt(i) == '/' && s.charAt(i + 1) == '*') {
                        f = true;
                        i++;
                    }
                    else sb.append(s.charAt(i));
                }
            }
            if (!f && sb.length() > 0) {
                result.add(sb.toString());
                sb = new StringBuilder();
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String[] source = {"/*Test program */", "int main()", "{ ", "  // variable declaration ", "int a, b, c;",
                "/* This is a test", "   multiline  ", "   comment for ", "   testing */", "a = b + c;", "}"};
        System.out.println(removeComments(source));
    }
}
