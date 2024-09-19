package codingCompetitive.uvaOnlindeJudgeProblems.competitiveThree.bitManipulation;

import java.io.IOException;
import java.util.BitSet;
import java.util.Scanner;

public class JollybeeTournament {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        BitSet bitset = new BitSet();
        while (t --> 0) {
            int n = sc.nextInt(), m = sc.nextInt();
            int size = 1 << n;
            for (int i = 0; i < size; i++)
                bitset.set(i, true);
            for (int i = 0; i < m; i++) {
                int player = sc.nextInt();
                bitset.set(player - 1, false);
            }
            int walkOver = 0;
            while (size > 1) {
                for (int i = 0; i < size; i += 2) {
                    if (bitset.get(i)) {
                        if (!bitset.get(i + 1))
                            walkOver++;
                        bitset.set(i >> 1, true);
                    }
                    else {
                        if (bitset.get(i + 1)) {
                            walkOver++;
                            bitset.set(i >> 1, true);
                        }
                        else bitset.set(i >> 1, false);
                    }
                }
                size >>= 1;
            }
            System.out.println(walkOver);
        }
    }
}
