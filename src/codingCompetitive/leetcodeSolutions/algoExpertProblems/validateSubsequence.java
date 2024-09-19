package codingCompetitive.leetcodeSolutions.algoExpertProblems;

import java.util.List;

public class validateSubsequence {
    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        int flag = 0;
        int count = 0;
        for (int i = 0; i < sequence.size(); i++) {
            for (int j = flag; j < array.size(); j++){
                if (sequence.get(i) == array.get(j)) {
                    count++;
                    flag = j + 1;
                    break;
                }
            }
        }
        if (count == sequence.size()) return true;
        return false;
    }
    public static void main(String[] args) {
        List<Integer> array = List.of(5, 1, 22, 25, 6, -1, 8, 10);
        List<Integer> sequence = List.of(1, 6, -1, 10);
        System.out.println(isValidSubsequence(array, sequence));
    }
}
