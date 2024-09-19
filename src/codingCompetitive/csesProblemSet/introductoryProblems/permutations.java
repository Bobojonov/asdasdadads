package codingCompetitive.csesProblemSet.introductoryProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class permutations {

    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader read = new BufferedReader(inputStreamReader);
        long n = Integer.parseInt(read.readLine());
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
        if (n == 1) {
            System.out.println(1);
            return;
        }
        if (n == 2 || n == 3) {
            System.out.println("NO SOLUTION");
            return;
        }
        StringBuilder out = new StringBuilder();
        for (int i = 2; i <= n; i += 2) out.append(i + " ");
        for (int i = 1; i <= n; i += 2) out.append(i + " ");
        System.out.print(out);


    }
}
