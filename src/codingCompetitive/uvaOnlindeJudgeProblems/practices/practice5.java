package codingCompetitive.uvaOnlindeJudgeProblems.practices;

import java.util.*;


public class practice5 {

    static class Birthday {
        public int day;
        public int month;
        public int year;

        Birthday(int day, int month, int year) {
            this.day = day;
            this.month = month;
            this.year = year;
        }
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        PriorityQueue<Birthday> pq = new PriorityQueue<>((o1, o2) -> {
            if (o1.month != o2.month) return o2.month < o1.month ? 1 : -1;
            if (o1.day != o2.day) return o2.day < o1.day ? 1 : -1;
            if (o1.year != o2.year) return o2.year < o1.year ? 1 : -1;
            return 0;
        });
        while (n-- > 0) {
            String[] lines = sc.nextLine().split(" ");
            int d = Integer.parseInt(lines[0]);
            int m = Integer.parseInt(lines[1]);
            int y = Integer.parseInt(lines[2]);
            pq.offer(new Birthday(d, m, y));
        }
        while (!pq.isEmpty()) {
            Birthday out = pq.poll();
            System.out.println(out.day + " " + out.month + " " + out.year);
        }
    }


}