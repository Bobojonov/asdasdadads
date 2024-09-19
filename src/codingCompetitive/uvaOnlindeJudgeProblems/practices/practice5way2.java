package codingCompetitive.uvaOnlindeJudgeProblems.practices;

import java.util.Arrays;
import java.util.Scanner;

public class practice5way2 {

    static class Birthday implements Comparable<Birthday> {
        public int day;
        public int month;
        public int year;

        public Birthday(int d, int m, int y) {
            this.day = d;
            this.month = m;
            this.year = y;
        }

        public int compareTo(Birthday other) {
            if (this.month != other.month) {
                return (this.month > other.month) ? 1 : -1;
            } else if (this.day != other.day) {
                return (this.day > other.day) ? 1 : -1;
            } else if (this.year != other.year) {
                return (this.year > other.year) ? 1 : -1;
            } else {
                return 0;
            }
        }

        public String toString() {
            return "(" + this.day + ", " + this.month + ", " + this.year + ")";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Birthday[] days = new Birthday[n];
        int cnt = 0;
        while (n-- > 0) {
            String[] lines = sc.nextLine().split(" ");
            int d = Integer.parseInt(lines[0]);
            int m = Integer.parseInt(lines[1]);
            int y = Integer.parseInt(lines[2]);
            days[cnt++] = new Birthday(d, m, y);
        }
        Arrays.sort(days);
        System.out.println(Arrays.toString(days));
    }
}
