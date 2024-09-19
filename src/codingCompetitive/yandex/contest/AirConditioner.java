package codingCompetitive.yandex.contest;

import java.io.*;

public class AirConditioner {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] s = reader.readLine().split(" ");
        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);
        String x = reader.readLine();
        int result = switch (x) {
            case "heat" -> Math.max(a, b);
            case "freeze" -> Math.min(a, b);
            case "auto" -> b;
            case "fan" -> a;
            default -> 0;
        };
        System.out.println(result);
        reader.close();
        writer.close();
    }
}
