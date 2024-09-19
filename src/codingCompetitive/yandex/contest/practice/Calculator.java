package codingCompetitive.yandex.contest.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] str = reader.readLine().split(" ");
        for (int i = 2; i < str.length; i++) {
            if (!Character.isDigit(str[i].charAt(0))) {
                switch (str[i]) {
                    case "+":
                        str[i] = String.valueOf(Integer.parseInt(str[i - 1]) + Integer.parseInt(str[i - 2]));
                        break;
                    case "-":
                        str[i] = String.valueOf(Integer.parseInt(str[i - 1]) - Integer.parseInt(str[i - 2]));
                        break;
                    case "*":
                        str[i] = String.valueOf(Integer.parseInt(str[i - 1]) * Integer.parseInt(str[i - 2]));
                        break;
                    case "/":
                        str[i] = String.valueOf(Integer.parseInt(str[i - 1]) / Integer.parseInt(str[i - 2]));
                        break;
                }
            }
        }
        System.out.println(str[str.length - 1]);
    }
}
