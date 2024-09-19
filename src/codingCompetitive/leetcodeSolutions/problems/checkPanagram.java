package codingCompetitive.leetcodeSolutions.problems;

public class checkPanagram {

    public static boolean checkIfPangram(String sentence) {
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if(!sentence.contains(String.valueOf(ch))) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(s));
    }
}
