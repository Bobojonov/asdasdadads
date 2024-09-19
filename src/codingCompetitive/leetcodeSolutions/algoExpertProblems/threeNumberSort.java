package codingCompetitive.leetcodeSolutions.algoExpertProblems;

public class threeNumberSort {

    public static int[] threeNumberSort(int[] array, int[] order) {
        int cnt = 0;
        int[] result = new int[array.length];
        for (int num: order) {
            for (int i = 0; i < array.length; i++){
                if (num == array[i])
                    result[cnt++] = num;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = {1, 0, 0, -1, -1, 0, 1, 1};
        int[] order = {0, 1, -1};
        System.out.println(threeNumberSort(array, order));

    }

}
