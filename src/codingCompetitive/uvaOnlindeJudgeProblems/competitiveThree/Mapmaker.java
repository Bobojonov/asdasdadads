package codingCompetitive.uvaOnlindeJudgeProblems.competitiveThree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;

class MakeArray {
    public final int c[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    public final int dimension;
    private static int bounds[][] = {
            {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0},
            {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}
    };

    public MakeArray(Scanner sc) throws IOException {
        int baseAddr = sc.nextInt(), sBytes = sc.nextInt(), d, a = 0;
        dimension = sc.nextInt();
        d = dimension;
        for (int i = 0; i < d; i++) {
            bounds[i][0] = sc.nextInt();
            bounds[i][1] = sc.nextInt();
        }

        a += (c[d] = sBytes) * bounds[d - 1][0];
        while (d --> 0)
            a += (c[d] = c[1 + d] * (bounds[d][1] - bounds[d][0] + 1)) * bounds[d - 1][0];
        c[d] = baseAddr - a;
    }

}

public class Mapmaker {
    static StringBuilder outString;
    static Scanner sc;
    public static void main(String[] args) {
        run();

    }
    static void run() {
        outString = new StringBuilder();
        sc = new Scanner(System.in);
        try {
            solve();
        }
        catch (IOException | NullPointerException ioe){}
        finally {
            System.out.print(outString.toString());
        }
    }

    static void solve() throws IOException {
        HashMap<String, MakeArray> ma = new HashMap<>();
        int num, ref;
        num = sc.nextInt();
        ref = sc.nextInt();
        while (num --> 0)
            ma.put(sc.next(), new MakeArray(sc));
        while (ref --> 0) {
            String name = sc.next();
            phyAddr(ma.get(name), name);
        }
    }

    static void phyAddr(MakeArray arr, String name) throws IOException {
        int temp = sc.nextInt(), value = temp * arr.c[1];
        outString.append(name + "[" + temp);
        for (int i = 2; i <= arr.dimension; i++) {
            temp = sc.nextInt();
            outString.append(", " + temp);
            value += temp * arr.c[1];
        }
        outString.append("]= " + (value + arr.c[0]) + "\n");
    }
}
