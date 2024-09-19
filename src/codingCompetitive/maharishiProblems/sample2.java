package codingCompetitive.maharishiProblems;

public class sample2 {
    static int f(int[] a){
        int sum = 0;
        for (int i = 0; i < a.length; i++){
            if (a[i] % 2 == 0) sum = sum - a[i];
            else sum = sum + a[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] a = new int[]{1, 2};
        System.out.println(f(a));
    }
}
