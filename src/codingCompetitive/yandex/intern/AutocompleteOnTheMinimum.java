package codingCompetitive.yandex.intern;

import java.io.*;

public class AutocompleteOnTheMinimum {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] str = reader.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int q = Integer.parseInt(str[1]);
        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = reader.readLine();
        }
        for (int i = 0; i < q; i++) {
            str = reader.readLine().split(" ");
            int k = Integer.parseInt(str[0]);
            String prefix = str[1];
            int index = binarySearch(words, prefix);
            if (index == -1) System.out.println(-1);
            else {
                int cnt = 0;
                for (int j = index; j < n; j++) {
                    if (words[j].startsWith(prefix))
                        cnt++;
                    if (cnt == k) {
                        System.out.println(j + 1);
                        break;
                    }
                }
                if (cnt < k) System.out.println(-1);
            }
        }

        reader.close();
        writer.close();
    }

    public static int binarySearch(String[] words, String prefix) {
        int l = 0;
        int r = words.length - 1;
        int index = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (words[mid].startsWith(prefix)) {
                index = mid;
                r = mid - 1;
            } else if (words[mid].compareTo(prefix) < 0) {
                l++;
            } else r--;
        }
        return index;
    }
}
