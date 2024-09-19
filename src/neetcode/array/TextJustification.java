package neetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TextJustification {
    public static List<String> fullJustify(String[] words, int maxWidth) {
        StringBuilder sb = new StringBuilder();
        List<String> result = new ArrayList<>();
        for (String word : words) {
            int len = word.length();
            if (sb.length() + len >= maxWidth) {
                sb = new StringBuilder(fillLine(sb, maxWidth, false));
                result.add(sb.toString());
                sb = new StringBuilder(word);
                sb.append(" ");
            } else if (sb.length() + len == maxWidth) {
                sb.append(word).append(" ");
                result.add(sb.toString());
                sb = new StringBuilder();
            } else {
                sb.append(word).append(" ");
            }
        }
        if (!sb.isEmpty()) {
            System.out.println("WOW  " + sb);
            sb = new StringBuilder(fillLine(sb, maxWidth, true));
            result.add(sb.toString());
        }
        return result;
    }

    public static String fillLine(StringBuilder sb, int maxWidth, Boolean lastLine) {
        String[] split = sb.toString().split(" ");
        int cnt = Arrays.stream(split).mapToInt(String::length).sum();
        System.out.println(cnt + "  CNT");
        int spaces = maxWidth - cnt;
        System.out.println("SPACES  " + spaces);
        if (split.length > 1 && !lastLine) {
            while (spaces > 0) {
                for (int i = 0; i < split.length - 1; i++) {
                    if (spaces == 0) break;
                    split[i] = split[i] + " ";
                    spaces--;
                }
            }
        } else {
            while (spaces > 0 && !lastLine) {
                split[0] = split[0] + " ";
                System.out.println(split[0] + " I AM HERE");
                spaces--;
            }
        }
        System.out.println("asdadasdasd");
        System.out.println(Arrays.toString(split));
        if (lastLine) {
            while (spaces > 0) {
                sb.append(" ");
                spaces--;
            }
        }
        else {
            sb = new StringBuilder();
            for (String s : split) {
                sb.append(s);
            }   
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String[] words = {"This", "is", "an", "example", "of", "text", "justification."};
        System.out.println(fullJustify(words, 16));
    }
}
