package codingCompetitive.leetcodeSolutions.crackingCodingInterview;

public class palindromPermutation {
    public static boolean isPermutationOfPalindrome(String phrase) {
        int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
        int odd_count = 0;
        for (char ch: phrase.toCharArray()) {
            int x = getCharNumber(ch);
            if (x != -1) {
                table[x]++;
                if (table[x] % 2 == 1) odd_count++;
                else odd_count--;
            }
        }
        return odd_count <= 1;
    }

    public static int getCharNumber(Character ch) {
        int z   = Character.getNumericValue('z');
        int a   = Character.getNumericValue('a');
        int val = Character.getNumericValue(ch);
        if (a <= val && val <= z) return val - a;
        return -1;
    }
    public static void main(String[] args) {
        String phrase = "Tact Coa";
        System.out.println(isPermutationOfPalindrome(phrase));
    }
}
