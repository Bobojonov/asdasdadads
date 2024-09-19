package codingCompetitive.leetcodeSolutions;

import java.util.HashMap;
import java.util.Map;

public class CanIWin {
    static Map<Integer, Boolean> map = new HashMap<>();
    static boolean[] used;
    public static boolean canIWin(int maxChoosableInteger, int desiredTotal) {
        int sum = (1 + maxChoosableInteger) * maxChoosableInteger / 2;
        if (sum < desiredTotal) return false;
        used = new boolean[maxChoosableInteger + 1];
        if (desiredTotal <= 0) return true;
        return canWin(desiredTotal);
    }
    
    public static boolean canWin(int desiredTotal) {
        if (desiredTotal <= 0) return false;
        int key = transferToInt(used);
        System.out.println(key);
        if (!map.containsKey(key)) {
            for (int i = 1; i < used.length; i++) {
                if (!used[i]){
                    used[i] = true;
                    if (!canWin(desiredTotal - i)) {
                        map.put(key, true);
                        used[i] = false;
                        return true;
                    }
                    used[i] = false;
                }
            }
            map.put(key, false);
        }
        return map.get(key);
    }

    public static int transferToInt(boolean[] used){
        int num = 0;
        for(boolean b: used){
            num <<= 1;
            if(b) num |= 1;
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.println(canIWin(10, 11));
    }
}
