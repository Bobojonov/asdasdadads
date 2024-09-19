package codingCompetitive.leetcodeSolutions.algoExpertProblems;


public class CaesarCipgrEncryptor {
    public static String caesarCypherEncryptor(String str, int key) {
        String shifted = "";
        for (int i = 0; i < str.length(); i++) {
            int ascii = str.charAt(i) + (key % 26);
            if (ascii > 'z') ascii -= 26;
            shifted += (char)ascii;
        }
        return shifted;
    }

    public static void main(String[] args) {
        String string = "abc";
        int key = 52;
        System.out.println(caesarCypherEncryptor(string, key));

    }
}
