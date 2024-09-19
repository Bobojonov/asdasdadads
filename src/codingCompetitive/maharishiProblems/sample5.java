package codingCompetitive.maharishiProblems;

public class sample5 {
    public static int[] f(int[] first, int[] second){
        if (first == null || second == null) return null;
        int min = (first.length < second.length) ? first.length : second.length;
        int[] res = new int[min];
        int k = 0;
        if (first.length == min){
            for (int i = 0; i < min; i++){
                for (int j = 0; j < second.length; j++){
                    if (first[i] == second[j]){
                        res[k++] = first[i];
                        break;
                    }
                }
            }
        }else {
            for (int i = 0; i < min; i++){
                for (int j = 0; j < first.length; j++){
                    if (second[i] == first[j]){
                        res[k++] = first[j];
                        break;
                    }
                }
            }
        }
        int[] ans = new int[k];
        for (int i = 0; i < k; i++) ans[i] = res[i];
        for (int i = 0; i < k; i++) System.out.print(ans[i] + " ");
        return ans;
    }

    public static void main(String[] args) {
        int[] first = new int[]{1, 2};
        int[] second = new int[] {3, 4};
        f(first, second);
    }

}
