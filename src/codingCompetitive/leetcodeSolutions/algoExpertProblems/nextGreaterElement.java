package codingCompetitive.leetcodeSolutions.algoExpertProblems;

import java.util.ArrayList;
import java.util.Arrays;

public class nextGreaterElement {

    public static int[] nextGreaterElement(int[] array) {
        ArrayList<Integer> stack = new ArrayList<>();
        int[] result = new int[array.length];
        Arrays.fill(result, -1);
        for (int i = 0; i < 2 * array.length; i++) {
            int currIdx = i % array.length;
            while (stack.size() > 0 && array[stack.get(stack.size() - 1)] < array[currIdx]) {
                int top = stack.remove(stack.size() - 1);
                result[top] = array[currIdx];
            }
            stack.add(currIdx);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = new int[] {2, 5, -3, -4, 6, 7, 2};
        System.out.println(nextGreaterElement(array));
    }
}
