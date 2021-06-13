package ch6.dahye.item40;

import java.util.HashSet;
import java.util.Set;

public class Biagram {
    private final char first;
    private final char second;

    public Biagram(char first, char second) {
        this.first = first;
        this.second = second;
    }

    @Override public boolean equals(Object o) {
        if (!(o instanceof Biagram)) {
            return false;
        }
        Biagram b = (Biagram) o;
        return b.first == first && b.second == second;
    }

    @Override public int hashCode() {
        return 31 * first + second;
    }

    public static void main(String[] args) {
        Set<Biagram> s = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            for (char ch = 'a'; ch <= 'z'; ch++) {
                s.add(new Biagram(ch, ch));
            }
        }
        System.out.println(s.size());
    }
}
