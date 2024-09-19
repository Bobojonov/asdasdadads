package codingCompetitive.leetcodeSolutions.problems;

import java.util.ArrayList;
import java.util.List;

public class pascalTriangleII {

    public List<Integer> getRow(int rowIndex) {
        List<Integer> triangle = new ArrayList<>(rowIndex + 1);
        triangle.add(1);
        for (int i = 0; i < rowIndex; i++) {
            for (int j = i; j >= 0; j--)
                triangle.set(j, triangle.get(j) + triangle.get(j - 1));
            triangle.add(1);
        }
        return triangle;
    }

}
