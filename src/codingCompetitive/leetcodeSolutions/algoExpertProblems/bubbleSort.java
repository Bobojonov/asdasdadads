package codingCompetitive.leetcodeSolutions.algoExpertProblems;

public class bubbleSort {
    public static int[] bubbleSort(int[] array) {
        int swaps = -1;
        while (swaps != 0) {
            swaps = 0;
            for (int i = 0; i < array.length - 1; i++){
                if (array[i] > array[i + 1]) {
                    swaps++;
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
        return array;
    }
    public static void main(String[] args) {

    }
}
