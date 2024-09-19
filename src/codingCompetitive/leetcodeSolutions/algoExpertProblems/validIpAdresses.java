package codingCompetitive.leetcodeSolutions.algoExpertProblems;

import java.util.ArrayList;

public class validIpAdresses {

    public static ArrayList<String> validIPAddresses(String string) {
        ArrayList<String> ipAdresses = new ArrayList<>();
        for (int i = 0; i < string.length() - 3; i++) {
            for (int j = i + 1; j < string.length() - 2; j++) {
                for (int k = j + 1; k < string.length() - 1; k++) {
                    String subst1 = string.substring(0, i + 1);
                    String subst2 = string.substring(i + 1, j + 1);
                    String subst3 = string.substring(j + 1, k + 1);
                    String subst4 = string.substring(k + 1);
                    if (isValidIp(subst1) && isValidIp(subst2) && isValidIp(subst3) && isValidIp(subst4)){
                        ipAdresses.add(new String(subst1 + "." + subst2 + "." + subst3 + "." + subst4));
                    }
                }
            }
        }
        return ipAdresses;
    }

    public static boolean isValidIp(String string) {
        return Integer.parseInt(string) < 256 && (string.length() > 1 && string.charAt(0) != '0' || string.length() == 1);
    }

    public static void main(String[] args) {
        String string = "1921680";
        System.out.println(validIPAddresses(string));
    }
}
