package codingCompetitive.leetcodeSolutions.leetcode.array;

public class MaximumNumberOfWordsFoundSentences {
    public int mostWordsFound(String[] sentences) {
        int result = 0;
        for (String sentence : sentences) {
            int split = sentence.split(" ").length;
            if (split > result) result = split;
        }
        return result;
    }
}
