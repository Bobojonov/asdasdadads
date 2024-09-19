package codingCompetitive.leetcodeSolutions.algoExpertProblems;

import java.util.*;

public class taskAssignment {

    public ArrayList<ArrayList<Integer>> taskAssignment(int k, ArrayList<Integer> tasks) {
        ArrayList<int[]> tasksToIndices = new ArrayList<>();
        int size = tasks.size();
        for (int i = 0; i < size; i++){
            tasksToIndices.add(new int[]{tasks.get(i), i});
        }
        Collections.sort(tasksToIndices, (x, y) -> x[0] - y[0]);

        size = 2 * k - 1;
        int i = 0;
        ArrayList<ArrayList<Integer>> pairs = new ArrayList<ArrayList<Integer>>();
        while (i < size) {
            ArrayList<Integer> sublist = new ArrayList<>();
            sublist.add(tasksToIndices.get(i++)[1]);
            sublist.add(tasksToIndices.get(size--)[1]);
            pairs.add(sublist);
        }
        return pairs;
    }


    /*
    3, 7, 5, 4, 4, 3, 6, 8, 3, 3
    3 3 3 3 4 4 5 6 7 8
    [9, 7],
  [8, 1],
  [5, 6],
  [0, 2],
  [4, 3]
     */

    /*
    [0, 7],
  [1, 2]
     */
}
