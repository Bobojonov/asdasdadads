package neetcode.array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PathCrossing {
    public static boolean isPathCrossing(String path) {
        Map<Character, int[]> moves = new HashMap<>();
        moves.put('N', new int[]{0, 1});
        moves.put('S', new int[]{0, -1});
        moves.put('W', new int[]{-1, 0});
        moves.put('E', new int[]{1, 0});
        Set<int[]> visited = new HashSet<>();
        visited.add(new int[]{0, 0});
        int x = 0, y = 0;
        for (char p: path.toCharArray()) {
            int[] curr = moves.get(p);
            int dx = curr[0];
            int dy = curr[1];
            x += dx; y += dy;
            int[] pair = {x, y};
            if (visited.contains(pair)) return true;
            visited.add(pair);
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPathCrossing("NESWW"));
    }
}
