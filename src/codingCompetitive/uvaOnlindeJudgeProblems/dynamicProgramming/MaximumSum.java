package codingCompetitive.uvaOnlindeJudgeProblems.dynamicProgramming;//package codingCompetitive.uvaOnlindeJudgeProblems.dynamicProgramming;
//
//import java.util.Scanner;
//
//public class MaximumSum {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[][] rec = new int[n][n];
//        for (int i = 0; i < n; i++)
//            for (int j = 0; j < n; j++)
//                rec[i][j] = sc.nextInt();
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++)
//                System.out.print(rec[i][j] + " ");
//            System.out.println();
//        }
//
//    }
//
//    public static int maxSum(int[][] rec) {
//        for (int i = 0; i < rec.length; i++) {
//            for (int j = 0; j < rec.length; j++) {
//                if (i > 0) rec[i][j] += rec[i - 1][j];
//                if (j > 0) rec[i][j] += rec[i][j - 1];
//                if (i > 0 && j > 0) rec[i][j] -= rec[i - 1][j - 1];
//            }
//        }
//        int matrix = Integer.MIN_VALUE;
//        for (int i = 0; i < rec.length; i++) {
//
//        }
//    }
//}
