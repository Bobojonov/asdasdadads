package codingCompetitive.leetcodeSolutions.algoExpertProblems;

public class monotonicArray {

    public static boolean isMonotonic(int[] array) {
        if (array.length == 0) return true;
       int count1 = 0;
       for (int i = 1; i < array.length; i++)
           if (array[i] >= array[i - 1]) count1++;
        int count2 = 0;
        for (int i = 1; i < array.length; i++)
            if (array[i] <= array[i - 1]) count2++;
        System.out.println(count1 + "  " + count2);
        return count1 == array.length - 1 || count2 == array.length -1;
    }

    public static void main(String[] args) {
        int[] array = {-1, -5, -10, -1100, -1100, -1101, -1102, -9001};
        System.out.println(isMonotonic(array));
    }
}
