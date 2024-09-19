package codingCompetitive.yandex.contest;

import java.io.*;

public class PhoneNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        String recorded = reader.readLine();
        String[] existingNumbers = new String[3];
        for (int i = 0; i < 3; i++) {
            existingNumbers[i] = reader.readLine();
        }
        String normalized = normalizePhoneNumber(recorded);
        for (String existingNumber: existingNumbers) {
            String res = normalizePhoneNumber(existingNumber);
            if (normalized.equals(res)) System.out.println("YES");
            else System.out.println("NO");
        }
        reader.close();
        writer.close();
    }

    private static String normalizePhoneNumber(String number) {
        String cleaned = number.replaceAll("\\D", "");
        String countryCode = "+7";
        String areaCode = "495";
        String phoneNumber = "";

        if (cleaned.startsWith("8")) {
            cleaned = cleaned.substring(1);
        } else if (cleaned.startsWith("7")) {
            cleaned = cleaned.substring(1);
        }

        if (cleaned.length() == 7) {
            phoneNumber = areaCode + cleaned;
        } else if (cleaned.length() == 10) {
            phoneNumber = cleaned;
        } else if (cleaned.length() == 11) {
            phoneNumber = cleaned.substring(1);
        }
        return countryCode + phoneNumber;
    }
}
