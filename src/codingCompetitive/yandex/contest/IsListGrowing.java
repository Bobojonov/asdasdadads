package codingCompetitive.yandex.contest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IsListGrowing {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] str = reader.readLine().split(" ");
        boolean f = true;
        for (int i = 0; i < str.length - 1; i++)
            if (Integer.parseInt(str[i]) >= Integer.parseInt(str[i + 1])) {
                f = false;
                System.out.println("NO");
                break;
            }
        if (f) System.out.println("YES");
        reader.close();
    }
}
