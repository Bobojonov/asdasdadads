package codingCompetitive.uvaOnlindeJudgeProblems.treeMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class WordIndex {
    static Map<String, Integer> memo;
    static int cnt;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        memo = new HashMap<>();
        cnt = 1;
        for (int i = 1; i <= 5; i++) {
            enumurete("", i);
        }
        String s;
        while (true) {
            s = br.readLine();
            if (s == null || s.equals("")) break;
            if (memo.get(s) == null) System.out.println(0);
            else System.out.println(memo.get(s));
        }
    }

    static void enumurete(String s, int len) {
        if (s.length() == len) {
            memo.put(s,cnt);
            cnt++;
            return;
        }
        char last;
        if (s.isEmpty())
            last = 'a';
        else last = (char) (s.charAt(s.length() - 1) + 1);
        for (char c = last; c <= 'z'; c++) {
            enumurete(s + c, len);
        }
    }
}
