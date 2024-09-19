package codingCompetitive.uvaOnlindeJudgeProblems.competitiveThree.AdHocProblems;

import java.util.Scanner;
import java.util.Stack;

public class BeggarMyNeighbour {

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        while (true) {
            String str = sc.next();
            if (str.charAt(0) == '#') break;
            Stack<Character> player1 = new Stack<>();
            Stack<Character> player2 = new Stack<>();
            player2.push(str.charAt(1));
            for (int i = 1; i < 52; i++) {
                str = sc.next();
                if (i % 2 == 0) player2.push(str.charAt(1));
                else player1.push(str.charAt(1));

            }

            boolean two = true;
            Stack<Character> stack = new Stack<>();
            while (true) {
                if (two) {
                    if (!player2.isEmpty())
                        stack.push(player2.pop());
                    else break;
                } else {
                    if (!player1.isEmpty())
                        stack.push(player1.pop());
                    else break;
                }
                two ^= true;
                if (!((stack.peek() >= '2' && stack.peek() <= '9') || stack.peek() == 'T')) {
                    char c = stack.peek();
                    int cnt = count(c);
                    boolean f = false;
                    while (cnt > 0) {
                        if (two) {
                            if (!player2.isEmpty())
                                stack.push(player2.pop());
                            else {
                                f = true;
                                break;
                            }
                        } else {
                            if (!player1.isEmpty())
                                stack.push(player1.pop());
                            else {
                                f = true;
                                break;
                            }
                        }
                        cnt--;
                        if (!((stack.peek() >= '2' && stack.peek() <= '9') || stack.peek() == 'T')) {
                            two ^= true;
                            c = stack.peek();
                            cnt = count(c);
                        }
                    }
                    if (f) {
                        break;
                    }
                    if (two) { while (!stack.isEmpty()) player1.add(0, stack.remove(0));}
                    else { while (!stack.isEmpty()) player2.add(0, stack.remove(0)); }
                    two ^= true;
                }
            }
            if (player2.size() == 0)
                System.out.print(String.format("1%3d\n", player1.size()));
            else System.out.print(String.format("2%3d\n", player2.size()));
        }
        sc.close();
    }

    public static int count(char n) {

        if (n == 'J') return 1;
        else if (n == 'Q') return 2;
        else if (n == 'K') return 3;
        else return 4;

    }
}