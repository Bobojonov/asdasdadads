package codingCompetitive.yandex.contest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class SymmetricSequence {
    
    public static boolean isPalindrome(List<Integer> list, int l, int r) {
        while (l < r) {
            if (!list.get(l).equals(list.get(r)))
                return false;
            l++;
            r--;
        }
        return true;
    }

    public static List<Integer> findMinimumNumberToAdd(List<Integer> list) {
        int n = list.size();
        for (int i = 0; i < n; i++) {
            if (isPalindrome(list, i, n - 1)) {
                List<Integer> toAdd = new ArrayList<>();
                for (int j = i - 1; j >= 0; j--) {
                    toAdd.add(list.get(j));
                }
                return toAdd;
            }
        }
        return new ArrayList<>();
    }
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        String[] str = reader.readLine().split(" ");
        StringBuilder s = new StringBuilder();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(str[i]));
        }
        List<Integer> res = findMinimumNumberToAdd(list);
        System.out.println(res.size());
        for (int num: res)
            System.out.print(num + " ");
        reader.close();
    }

}
