package codingCompetitive.yandex.contest.practice;

import java.util.*;

public class Neighbours {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int a = sc.nextInt(), b = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        if (a - 1 >= 0) list.add(arr[a - 1][b]);
        if (a + 1 < n) list.add(arr[a + 1][b]);
        if (b - 1 >= 0) list.add(arr[a][b - 1]);
        if (b + 1 < m) list.add(arr[a][b + 1]);
        Collections.sort(list);
        for (Integer e: list)
            System.out.print(e + " ");
    }
}
