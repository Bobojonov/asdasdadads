package codingCompetitive.advanceOfCode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class DayThreeTask2 {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        StringBuilder sb = new StringBuilder();
        int i = 0;
        String[] str = new String[4];
        while (true) {
            String s = br.readLine();
            if (s == null || s.equals(""))
                break;
            Set<Character> set1 = findUnuqie(s);
            Set<Character> set2 = findUnuqie(br.readLine());
            Set<Character> set3 = findUnuqie(br.readLine());
            set1.retainAll(set2);
            set1.retainAll(set3);
            for (char c: set1)
                sum += c >= 'a' ? c - 'a' + 1 : c - 'A' + 27;
        }
        System.out.println(sum);
    }

    public static Set<Character> findUnuqie(String s) {
        Set<Character> set = new HashSet<>();
        for (char c: s.toCharArray())
            set.add(c);
        return set;
    }

}
