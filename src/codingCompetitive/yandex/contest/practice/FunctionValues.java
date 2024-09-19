package codingCompetitive.yandex.contest.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FunctionValues {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] str = reader.readLine().split(" ");
        int a = Integer.parseInt(str[0]);
        int x = Integer.parseInt(str[1]);
        int b = Integer.parseInt(str[2]);
        int c = Integer.parseInt(str[3]);
        System.out.println(a * x * x + b * x + c);
    }
    
}
