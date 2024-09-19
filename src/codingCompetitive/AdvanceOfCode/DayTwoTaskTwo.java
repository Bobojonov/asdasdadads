package codingCompetitive.AdvanceOfCode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class DayTwoTaskTwo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int result = 0;
        while (true) {
            String s = br.readLine();
            if (s == null || s.equals("")) break;
            HashMap<String, Integer> map = new HashMap<>();
            map.put("A X", 3);
            map.put("A Y", 4);
            map.put("A Z", 8);
            map.put("B X", 1);
            map.put("B Y", 5);
            map.put("B Z", 9);
            map.put("C X", 2);
            map.put("C Y", 6);
            map.put("C Z", 7);
            result += map.get(s);
//            StringTokenizer st = new StringTokenizer(s);
//            char p1 = st.nextToken().charAt(0);
//            char p2 = st.nextToken().charAt(0);
//            HashMap<Character, Integer> score = new HashMap<>();
//            score.put('R', 1);
//            score.put('P', 2);
//            score.put('S', 3);
//            HashMap<Character, Character> map = new HashMap<>();
//            map.put('R', 'S');
//            map.put('S', 'P');
//            map.put('P', 'R');
//            HashMap<Character, Character> convert = new HashMap<>();
//            convert.put('A', 'R');
//            convert.put('B', 'P');
//            convert.put('C', 'S');
//            char encrypt1 = convert.get(p1);
//            if (p2 == 'Y') {
//                result += 3 + score.get(encrypt1);
//            } else if (p2 == 'X') {
//                result += score.get(map.get(convert.get(p1)));
//            } else {
//                for (Map.Entry<Character, Character> entry: map.entrySet()) {
//                    if (entry.getValue() == encrypt1) {
//                        result += 6 + score.get(entry.getKey());
//                        break;
//                    }
//                }
//            }
        }
        System.out.println(result);
    }

}
