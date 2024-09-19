package codingCompetitive.topCoderProblems;

public class A0Paper {

    public static String canBuild(int[] A) {
        for (int i = A.length - 1; i > 0; i--)
            A[i - 1] += A[i] / 2;
        return A[0] > 0 ? "Possible" : "Impossible";
    }

    public static void main(String[] args) {
        System.out.println(canBuild(new int[] {0,0,0,0,15}));
    }
}
