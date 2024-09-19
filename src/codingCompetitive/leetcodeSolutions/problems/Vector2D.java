package codingCompetitive.leetcodeSolutions.problems;

import java.util.NoSuchElementException;

public class Vector2D {

    private int[][] vector;
    private int inner = 0;
    private int outer = 0;

    public Vector2D(int[][] vec) {
        vector = vec;
    }

    private void advanceToNext() {
        while (outer < vector.length && inner == vector[outer].length) {
            inner = 0;
            outer++;
        }
    }

    public int next() {
        if (!hasNext()) throw new NoSuchElementException();
        return vector[outer][inner++];
    }

    public boolean hasNext() {
        advanceToNext();
        return outer < vector.length;
    }
}
