package codingCompetitive.leetcodeSolutions.algoExpertProblems;

public class insertionSort {
    public static int[] insertionSort(int[] array) {
        int i = 0;
        while (i != array.length - 1){
            int min = array[i];
            int minIdx = i;
            for (int j = i; j < array.length; j++){
                if (array[j] < min) {
                    min = array[j];
                    minIdx = j;
                }
            }
            int temp = array[i];
            array[i] = array[minIdx];
            array[minIdx] = temp;
            i++;
        }
        return array;
    }
    public static void main(String[] args) {

    }
}
