package codingCompetitive.leetcodeSolutions.algoExpertProblems;

public class binarySearch {
    public static int binarySearch(int[] array, int target) {
        int l = 0;
        int r = array.length;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (array[mid] == target) return mid;
            if (array[mid] < target) l++;
            else r--;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] array = {1, 5, 23, 111};
        int target = 111;
        System.out.println(binarySearch(array, target));

    }
}
