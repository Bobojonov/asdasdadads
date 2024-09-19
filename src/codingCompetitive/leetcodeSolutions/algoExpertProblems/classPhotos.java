package codingCompetitive.leetcodeSolutions.algoExpertProblems;

import java.util.ArrayList;
import java.util.Collections;

public class classPhotos {
    public boolean classPhotos(ArrayList<Integer> redShirtHeights, ArrayList<Integer> blueShirtHeights) {
        int count = 0;
        Collections.sort(redShirtHeights);
        Collections.sort(blueShirtHeights);
        for (int i = 0; i < redShirtHeights.size(); i++) {
            if (redShirtHeights.get(i) < blueShirtHeights.get(i)) count++;
            else if (redShirtHeights.get(i) > blueShirtHeights.get(i)) count--;
            else return false;
        }
        return Math.abs(count) == redShirtHeights.size();
    }
    public static void main(String[] args) {


    }
}
