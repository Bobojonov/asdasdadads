package codingCompetitive.AdvanceOfCode;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DaySixTaskOne extends AOCTasks {

    public DaySixTaskOne() {
        super("6");
    }

    @Override
    void solve(List<String> input) {
        String line = input.get(0);
        lap(findMaker(line, 4));
        lap(findMaker(line, 14));
    }

    public int findMaker(String input, int len) {
        int idx = 0;
        String curr = input.substring(0, len);
        while (hasDuplicates(curr, len)) {
            idx++;
            curr = input.substring(idx, idx + len);
        }
        return idx + len;
    }

    public boolean hasDuplicates(String curr, int length) {
        Set<Character> chars = new HashSet<>();
        for (char c: curr.toCharArray())
            chars.add(c);
        return chars.size() != length;
    }

    public static void main(String[] args) {
        DaySixTaskOne daySixTaskOne = new DaySixTaskOne();
    }
}
