package neetcode.array;

import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAddresses {
    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
        for (String email: emails) {
            String[] split = email.split("@");
            String head = split[0];
            String tail = split[1];
            String[] s = head.split("\\+");
            set.add(s[0].replace(".", "") + "@" + tail);
        }
        return set.size();
    }
}
