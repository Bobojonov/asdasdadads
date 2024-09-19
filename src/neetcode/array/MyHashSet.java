package neetcode.array;

import java.util.HashSet;
import java.util.Set;

class MyHashSet {
    Set<Integer> set;
    public MyHashSet() {
        set = new HashSet<>();
    }

    public void add(int key) {
        set.add(key);
    }

    public void remove(int key) {
        set.remove(key);
    }

    public boolean contains(int key) {
        return set.contains(key);
    }
}
