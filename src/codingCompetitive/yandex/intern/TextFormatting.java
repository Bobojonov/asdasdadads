package codingCompetitive.yandex.intern;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TextFormatting {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = reader.readLine();
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        int maxLen = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ',') {
                maxLen = Math.max(sb.length(), maxLen);
                sb.append(',');
                list.add(sb.toString());
                sb = new StringBuilder();
            } else if (str.charAt(i) == ' ') {
                if (!sb.isEmpty()) {
                    list.add(sb.toString());
                    maxLen = Math.max(sb.length(), maxLen);
                    sb = new StringBuilder();
                }
            } else sb.append(str.charAt(i));
        }
        if (!sb.isEmpty()) {
            list.add(sb.toString());
            maxLen = Math.max(sb.length(), maxLen);
        }
        int currLineLen = 0;
        maxLen *= 3;
        for (int i = 0; i < list.size(); i++) {
            String currStr = list.get(i);
            int len = currLineLen + currStr.length();
            if (len <= maxLen) {
                if (len == maxLen) {
                    System.out.println(currStr);
                    currLineLen = 0;
                } else {
                    if (len + 1 == maxLen) {
                        System.out.print(currStr);
                        System.out.println();
                        currLineLen = 0;
                    } else {
                        if (i < list.size() - 1) {
                            if (list.get(i + 1).length() + len <= maxLen) {
                                currLineLen = len + 1;
                                System.out.print(currStr + " ");
                            } else {
                                System.out.print(currStr);
                                System.out.println();
                                currLineLen = 0;
                            }
                        } else {
                            System.out.print(currStr);
                            currLineLen = 0;
                        }
                    }
                }
            } else {
                System.out.println();
                if (i < list.size() - 1) System.out.print(list.get(i) + " ");
                else System.out.print(list.get(i));
            }
        }
        reader.close();
        writer.close();
    }
}
