package neetcode.array;

public class RedistributeCharactersToMakeAllStringsEqual {
    public boolean makeEqual(String[] words) {
        StringBuilder sb = new StringBuilder();
        int[] cnt = new int[26];
        for (String word : words) {
            for (char c : word.toCharArray())
                cnt[c - 'a']++;
        }
        for (int w: cnt) {
            if (w % words.length != 0) return false;
        }
        return true;

    }
}
