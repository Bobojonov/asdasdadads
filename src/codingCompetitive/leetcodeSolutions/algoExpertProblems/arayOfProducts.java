package codingCompetitive.leetcodeSolutions.algoExpertProblems;

public class arayOfProducts {

    public static int[] arrayOfProducts(int[] array) {
        int[] products = new int[array.length];
        int[] leftProducts = new int[array.length];
        int[] rightProducts = new int[array.length];

        int left = 1;
        for (int i = 0; i < array.length; i++) {
            leftProducts[i] = left;
            left *= array[i];
        }
        for (int i = 0; i < array.length; i++)
            System.out.print(leftProducts[i] + " ");
        System.out.println();
        int right = 1;
        for (int i = array.length - 1; i >= 0; i--) {
            rightProducts[i] = right;
            right *= array[i];
        }
        for (int i = 0; i < array.length; i++)
            System.out.print(rightProducts[i] + " ");
        System.out.println();
        for (int i = 0; i < array.length; i++)
            products[i] = leftProducts[i] * rightProducts[i];
        return products;
    }

    public static void main(String[] args) {
        int[] array = {5, 1, 4, 2};
        System.out.println(arrayOfProducts(array));

    }
}
