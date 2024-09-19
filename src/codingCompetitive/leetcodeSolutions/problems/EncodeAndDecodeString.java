package codingCompetitive.leetcodeSolutions.problems;

import java.util.ArrayList;
import java.util.List;

public class EncodeAndDecodeString {
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String str: strs)
            sb.append(str.length()).append('/').append(str);
        System.out.println(sb);
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int slash = str.indexOf('/', i);
            int size = Integer.valueOf(str.substring(i, slash));
            result.add(str.substring(slash + 1, slash + size + 1));
            i = slash + size + 1;
        }
        return result;
    }
}
