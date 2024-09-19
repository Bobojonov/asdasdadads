package codingCompetitive.leetcodeSolutions.geeksForGeeks;

public class minimumARepeatedBSubstring {
    static int minRepeats(String A, String B) {
        StringBuffer repeatedA = new StringBuffer(A);
        int count = 0;
        while (repeatedA.length() < B.length()) {
            repeatedA.append(A);
            count++;
        }
        if (repeatedA.toString().contains(B)) return count;
        repeatedA.append(A);
        count++;
        if (repeatedA.toString().contains(B)) return count;
        else return -1;
    }

}
