package codingCompetitive.uvaOnlindeJudgeProblems.competitiveThree;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Borrowers {

    static class Book implements Comparable<Book> {
        String title, author;
        public Book(String t, String s) {
            title = t;
            author = s;
        }
        @Override
        public int compareTo(Book o) {
            int x = this.author.compareTo(o.author);
            if (x != 0) return x;
            return this.title.compareTo(o.title);
        }
        public String toString() {
            return "Title: " + title + " Author: " + author + "\n";
        }
    }

    public static void main(String[] args) throws Throwable {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pr = new PrintWriter(System.out);
        List<Book> list = new ArrayList<>();
        String s;
        while (!(s = br.readLine()).equals("END")) {
            int last_index = s.lastIndexOf('"');
            String title = s.substring(0, last_index + 1);
            String author = s.substring(last_index + 1);
            list.add(new Book(title, author));
        }
        Collections.sort(list);
        boolean[] returned = new boolean[list.size()];
        boolean[] taken = new boolean[list.size()];
        while (!(s = br.readLine()).equals("END")) {
            if (s.charAt(0) == 'R') {
                String title = s.substring(s.indexOf('"'));
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i).title.equals(title)) {
                        returned[i] = true;
                        taken[i] = true;
                        break;
                    }
                }
            } else {
                if (s.charAt(0) == 'S') {
                    String after = "";
                    for (int i = 0; i < list.size(); i++) {
                        if (taken[i] && returned[i]) {
                            if (after.equals("")) pr.append("Put " + list.get(i).title + "first\n");
                            else pr.append("Put " + list.get(i).title + " after " + after + '\n');
                            taken[i] = false;
                        }
                        if (!taken[i]) after = list.get(i).title;
                    }
                    pr.append("END\n");
                }
                else {
                    String title = s.substring(s.indexOf('"'));
                    for (int i = 0; i < list.size(); i++) {
                        if (list.get(i).title.equals(title)) {
                            returned[i] = true;
                            taken[i] = true;
                            break;
                        }
                    }
                }
            }

        }
        pr.flush();
        br.close();
    }
}
