package codingCompetitive.yandex.contest;
//
import java.io.*;

public class PhoneNumberII {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        String recorded = reader.readLine().replace("-", "").replace("(", "").replace(")", "");
        if (recorded.length() > 7) {
            if (recorded.charAt(0) == '+') recorded = recorded.substring(2);
            else if (recorded.charAt(0) == '8') recorded = recorded.substring(1);
        } else if (recorded.length() == 7) {
            recorded = "495" + recorded;
        }
        for (int i = 0; i < 3; i++) {
            String newPhoneNumber = reader.readLine().replace("-", "").replace("(", "").replace(")", "");;
            if (newPhoneNumber.length() > 7) {
                if (newPhoneNumber.charAt(0) == '+') newPhoneNumber = newPhoneNumber.substring(2);
                else if (newPhoneNumber.charAt(0) == '8') newPhoneNumber = newPhoneNumber.substring(1);
            } else if (newPhoneNumber.length() == 7) {
                newPhoneNumber = "495" + newPhoneNumber;
            }
            if (recorded.equals(newPhoneNumber)) System.out.println("YES");
            else System.out.println("NO");
        }
        reader.close();
        writer.close();
    }
}
