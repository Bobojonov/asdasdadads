package codingCompetitive.leetcodeSolutions.algoExpertProblems;

import java.util.HashMap;
import java.util.Map;

public class suffixTrieConstruction {

    static class TrieNode {
        Map<Character, TrieNode> children = new HashMap<Character, TrieNode>();
    }

    static class SuffixTrie {
        TrieNode root = new TrieNode();
        char endSymbol = '*';

        public SuffixTrie(String str) {
            populateSuffixTrieFrom(str);
        }

        public void populateSuffixTrieFrom(String str) {
            // Write your code here.
        }

        public boolean contains(String str) {
            // Write your code here.
            return false;
        }
    }

    public static void main(String[] args) {
        String str = "babc";

    }
}
