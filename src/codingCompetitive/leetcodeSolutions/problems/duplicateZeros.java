package codingCompetitive.leetcodeSolutions.problems;

public class duplicateZeros {
    public static boolean duplicateZeros(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == 0) {
                for (int j = n - 1; j > i + 1; j--)
                    arr[j] = arr[j - 1];
                arr[i + 1] = 0;
                i++;
            }
        }
        for (int i = 0; i < n; i++) System.out.print(arr[i] + " ");
        return false;
    }
    public static void main(String[] args) {
        int[] arr = new int[] {1,0,2,3,0,4,5,0};
        System.out.println(duplicateZeros(arr));
    }
}
