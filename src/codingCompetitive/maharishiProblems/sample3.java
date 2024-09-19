package codingCompetitive.maharishiProblems;

public class sample3 {
    public static char[] f(char[ ] a, int start, int len){
        if (start < 0 || len < 0|| start + len - 1 >= a.length) return null;
        else {
            char[] res = new char[len];
            for (int i = start, j = 0; j < len; i++, j++) res[j]=  a[i];
            return res;
        }
    }

    public static void main(String[] args) {
        char[] a = new char[]{'a', 'b', 'c'};
        int start = 0, len = 4;
        System.out.println(f(a, start, len));
    }

}
