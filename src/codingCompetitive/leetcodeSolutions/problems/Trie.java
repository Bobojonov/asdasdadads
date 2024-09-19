package codingCompetitive.leetcodeSolutions.problems;

class TrieNode {
    public boolean isEnd;
    public TrieNode[] next;
    public TrieNode() {
        isEnd = false;
        next = new TrieNode[256];
    }
}

class TrieImplement {
    public TrieNode root;
    public TrieImplement() {
        root = new TrieNode();
    }


    public void insert(String word) {
        TrieNode temp = root;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i);
            if (temp.next[idx] == null)
                temp.next[idx] = new TrieNode();
            temp = temp.next[idx];
        }
        temp.isEnd = true;
    }

    public boolean search(String word) {
        TrieNode element = root;
        for (int i = 0; i < word.length(); ++ i) {
            int idx = word.charAt(i);
            if (element.next[idx] == null)
                return false;
            element = element.next[idx];
        }
        return element.isEnd;
    }

    public void delete(String word) {
        root = delete(root, word, 0);
    }

    private TrieNode delete(TrieNode node, String word, int i) {
        if (node == null) return null;
        if (i == word.length()) {
            node.isEnd = false;
            if (isEmpty(node)) {
                node = null;
            }
            return node;
        }
        int idx = word.charAt(i);
        node.next[idx] = delete(node.next[idx], word, i + 1);
        return node;
    }

    private boolean isEmpty(TrieNode element) {
        for (int i = 0; i < element.next.length; i++) {
            if (element.next[i] != null) return false;
        }
        return true;
    }

public static class Trie {

    public static void main(String[] args) {
        TrieImplement trie = new TrieImplement();
        trie.insert("salom");
        System.out.println(trie.search("salom"));
        trie.delete("salom");
        System.out.println(trie.search("salom"));

    }
    }
}
