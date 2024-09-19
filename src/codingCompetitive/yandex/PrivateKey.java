package codingCompetitive.yandex;

import java.io.*;

public class PrivateKey {

    public static void main(String[] args) throws IOException {
        BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer =new BufferedWriter(new OutputStreamWriter(System.out));
        String[] str = reader.readLine().split(" ");
        long a = Long.parseLong(str[0]);
        long b = Long.parseLong(str[1]);
        if (b % a != 0) {
            System.out.println(0);
            return;
        }

        long k = b / a;
        int cnt = 0;
        for (long i = 1; i * i <= k; i++) {
            if (k % i == 0) {
                long y = k / i;
                if (gcd(i, y) == 1) {
                    cnt += 2;
                    if (a == b) {
                        cnt--;
                    }
                }
            }
        }
        System.out.println(cnt);
        reader.close();
        writer.close();
    }

    public static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
