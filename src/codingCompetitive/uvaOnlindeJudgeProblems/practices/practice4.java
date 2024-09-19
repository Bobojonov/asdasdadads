package codingCompetitive.uvaOnlindeJudgeProblems.practices;

import java.util.*;

public class practice4 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        int n = 4;
        for (int i = 0; i < 4; i++) {
            Random rand = new Random();
            int x = rand.nextInt(100);
            if (!list.contains(x)) list.add(x);
        }
        Collections.sort(list);
        System.out.println(list);

    }
}
