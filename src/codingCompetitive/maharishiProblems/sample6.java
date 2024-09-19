package codingCompetitive.maharishiProblems;

public class sample6 {
    public static int f(int[] a){
        int sum = 0;
        for (int x: a) sum += x;
        int prefix = 0;
        for (int i = 0; i < a.length - 2; i++){
            prefix += a[i];
            if (prefix == sum - prefix - a[i + 1]) return i + 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 10, 3, 4};
        System.out.println(f(a));
    }
}
