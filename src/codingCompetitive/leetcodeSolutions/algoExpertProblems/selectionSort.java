package codingCompetitive.leetcodeSolutions.algoExpertProblems;

public class selectionSort {
    public static int[] selectionSort(int[] array) {
        if (array.length == 0) return new int[] {};
        for (int i = 0; i < array.length; i++){
            int minIdx = i;
            for (int j = i + 1; j < array.length; j++){
                if (array[j] < array[minIdx]) minIdx = j;
            }
            int temp = array[i];
            array[i] = array[minIdx];
            array[minIdx] = temp;
        }
        return array;
    }
    public static void main(String[] args) {

    }
}
