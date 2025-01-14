package neetcode.array;

import java.util.Arrays;

public class MaximumNumberOfBalloons {
    public static int maxNumberOfBalloons(String text) {
        String balloon = "balloon";
        int[] cnt1 = new int[26];
        for (int i = 0; i < balloon.length(); i++) {
            cnt1[balloon.charAt(i) - 'a']++;
        }
        System.out.println(Arrays.toString(cnt1));
        int[] cnt2 = new int[26];
        for (int i = 0; i < text.length(); i++) {
            if (cnt1[text.charAt(i) - 'a'] > 0) cnt2[text.charAt(i) - 'a']++;
        }
        System.out.println(Arrays.toString(cnt2));
        int cnt = 0;
        while (true) {
            boolean f = true;
            for (int j = 0; j < balloon.length(); j++) {
                int value = balloon.charAt(j) - 'a';
                cnt2[value]--;
                if (cnt2[value] < 0) {
                    f = false;
                    break;
                }
            }
            if (f) cnt++;
            else break;
        }
        return cnt;
    }

    public static void main(String[] args) {
        System.out.println(maxNumberOfBalloons("nlaebolko"));
    }
}
