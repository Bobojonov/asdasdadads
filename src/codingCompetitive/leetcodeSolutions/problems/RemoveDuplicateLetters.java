package codingCompetitive.leetcodeSolutions.problems;

import java.util.Stack;

public class RemoveDuplicateLetters {
    public static String removeDuplicateLetters(String s) {
        boolean[] seen = new boolean[26];
        Stack<Integer> st = new Stack<>();
        int[] arr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a'] = i;
        }
        for (int i = 0; i < s.length(); i++) {
            int curr = s.charAt(i) - 'a';
            if (seen[curr]) continue;
            while (!st.isEmpty() && st.peek() > curr && i < arr[st.peek()]) {
                seen[st.pop()] = false;
            }
            st.push(curr);
            seen[curr] = true;
        }
        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) sb.append((char)(st.pop() + 'a'));
        return sb.reverse().toString();
    }


    public static void main(String[] args) {
        System.out.println(removeDuplicateLetters("cbacdcbcdee"));
    }
}
