package codingCompetitive.leetcodeSolutions.problems;

import java.util.ArrayList;
import java.util.List;

public class pascalTriangle {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            curr.add(0, 1);
            for (int j =  1; j < curr.size() - 1; i++)
                curr.set(j, curr.get(j) + curr.get(j + 1));
            triangle.add(new ArrayList<>(curr));
        }
        return triangle;
    }

}
