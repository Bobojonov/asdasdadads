package codingCompetitive.leetcodeSolutions.problems;

import java.util.*;

public class InvalidTransactions {

    class Transaction {
        String name;
        int time;
        int amount;
        String city;
        public Transaction(String line) {
            String[] split = line.split(",");
            name   = split[0];
            time   = Integer.parseInt(split[1]);
            amount = Integer.parseInt(split[2]);
            city   = split[3];
        }
    }

    public List<String> invalidTransactions(String[] transactions) {
        List<String> inv = new ArrayList<>();
        Map<String, List<Transaction>> map = new HashMap<>();
        for (String tr: transactions) {
            Transaction t = new Transaction(tr);
            map.putIfAbsent(t.name, new ArrayList<>());
            map.get(t.name).add(t);

        }
        for (String tr: transactions) {
            Transaction t = new Transaction(tr);
            if (!isValid(t, map.getOrDefault(t.name, new ArrayList<>())))
                inv.add(tr);
        }
        return inv;
    }

    public boolean isValid(Transaction t, List<Transaction> list) {
        if (t.amount > 1000) return false;
        for (Transaction tr: list) {
            if (Math.abs(t.time - tr.time) <= 60 && !t.city.equals(tr.city))
                return false;
        }
        return true;
    }
}
