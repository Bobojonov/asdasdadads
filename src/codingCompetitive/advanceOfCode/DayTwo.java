package codingCompetitive.advanceOfCode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class DayTwo {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int result = 0;
        while (true) {
            String s = br.readLine();
            if (s == null || s.equals("")) break;

            HashMap<String, Integer> map = new HashMap<>();
            map.put("A X", 4);
            map.put("A Y", 8);
            map.put("A Z", 3);
            map.put("B X", 1);
            map.put("B Y", 5);
            map.put("B Z", 9);
            map.put("C X", 7);
            map.put("C Y", 2);
            map.put("C Z", 6);
            result += map.get(s);

//            HashMap<Character, Integer> score = new HashMap<>();
//            score.put('R', 1);
//            score.put('P', 2);
//            score.put('S', 3);
//            HashMap<Character, Character> map = new HashMap<>();
//            map.put('R', 'S');
//            map.put('S', 'P');
//            map.put('P', 'R');
//            map.put('A', 'R');
//            map.put('B', 'P');
//            map.put('C', 'S');
//            map.put('X', 'R');
//            map.put('Y', 'P');
//            map.put('Z', 'S');
//            char encrypt1 = map.get(p1);
//            char encrypt2 = map.get(p2);
//            if (encrypt1 == encrypt2) result += score.get(encrypt1) + 3;
//            else if (map.get(encrypt2) == encrypt1) result += score.get(encrypt2) + 6;
//            else result += score.get(encrypt2);
        }
        System.out.println(result);
    }

}
