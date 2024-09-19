package codingCompetitive.leetcodeSolutions.algoExpertProblems.arrays;

public class ArrayOfProducts {

    public int[] arrayOfProducts(int[] array) {
        int[] l = new int[array.length];
        int[] r = new int[array.length];
        int p = 1;
        for (int i = 0; i < array.length; i++) {
            l[i] = p;
            p *= array[i];
        }
        p = 1;
        for (int i = array.length - 1; i >= 0; i--) {
            r[i] = p;
            p *= array[i];
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = l[i] * r[i];
        }
        return array;
    }
}
